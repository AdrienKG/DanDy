package com.dandy.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.dandy.*;
import com.dandy.Character;

import java.util.List;

/**
 * Created by Adrien Gervais on 1/13/2015.
 */
public class AttackListViewAdapter  extends ArrayAdapter<Attack> {
    List<Attack> modelItems = null;
    Context context;
    public AttackListViewAdapter(Context context, List<Attack> resource) {
        super(context, android.R.layout.simple_list_item_multiple_choice, resource);
        this.context = context;
        this.modelItems = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.activity_main_list_view_row, parent, false);

        final TextView tvName = (TextView) convertView.findViewById(R.id.alvr_name);
        final TextView tvVsType = (TextView) convertView.findViewById(R.id.alvr_vs);
        final TextView tvAttackValue = (TextView) convertView.findViewById(R.id.alvr_attack_value);
        final TextView tvDamageValue = (TextView) convertView.findViewById(R.id.alvr_damage_value);

        final Attack item = modelItems.get(position);

        tvName.setText(item.getAttackName());
        tvVsType.setText(item.getAttackingType() + " vs " + item.getDefendingType());
        tvAttackValue.setText(item.getAttackValue());
        tvDamageValue.setText(item.getDamageValue());
        return convertView;
    }
}
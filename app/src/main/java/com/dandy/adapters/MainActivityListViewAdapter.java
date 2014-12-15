package com.dandy.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import com.dandy.Character;
import com.dandy.R;

public class MainActivityListViewAdapter extends ArrayAdapter<Character> {
    List<Character> modelItems = null;
    Context context;
    public MainActivityListViewAdapter(Context context, List<Character> resource) {
    super(context, android.R.layout.simple_list_item_multiple_choice, resource);
        this.context = context;
        this.modelItems = resource;
    }
    
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.activity_main_list_view_row, parent, false); 
        
        final TextView tvName = (TextView) convertView.findViewById(R.id.amlvr_name);
        final TextView tvRace = (TextView) convertView.findViewById(R.id.amlvr_race);
        final TextView tvClass = (TextView) convertView.findViewById(R.id.amlvr_class);
        final TextView tvLevel = (TextView) convertView.findViewById(R.id.amlvr_level);
        
        final Character item = modelItems.get(position);
        
        tvName.setText(item.getCharacterName());
        tvRace.setText("Race: " + item.getCharacterRace());
        tvClass.setText("Class: " + item.getCharacterClass());
        tvLevel.setText("Level: " + item.getCharacterLevel().toString());
        return convertView;
    }
}

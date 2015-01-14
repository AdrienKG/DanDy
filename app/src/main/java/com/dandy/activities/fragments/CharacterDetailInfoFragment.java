package com.dandy.activities.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dandy.R;

/**
 * Created by Adrien on 2014-12-19.
 */
public class CharacterDetailInfoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_characterdetail_abilities, container, false);
    }
}

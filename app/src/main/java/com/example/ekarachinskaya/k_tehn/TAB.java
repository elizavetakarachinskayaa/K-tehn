package com.example.ekarachinskaya.k_tehn;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by ekarachinskaya on 03.08.2017.
 */

public class TAB extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.uvedoml, container, false);
        return rootView;
    }
}


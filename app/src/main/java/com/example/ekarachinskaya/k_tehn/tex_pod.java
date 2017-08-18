package com.example.ekarachinskaya.k_tehn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by ekarachinskaya on 03.08.2017.
 */

public class tex_pod extends Fragment {

    Button vopros;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tex_pod, container, false);


        vopros = (Button)rootView.findViewById(R.id.vopros);
        vopros.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tex_pod.this.getActivity(), obr_sv.class);
                startActivity(intent);
            }
        });
        return rootView;




    }
}




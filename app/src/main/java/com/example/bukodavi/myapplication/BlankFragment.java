package com.example.bukodavi.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;


public class BlankFragment extends Fragment {

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View staticView = inflater.inflate(R.layout.activity_main, container, false);

        // Gomb beallitása, hogy tartalmat küldjön a statikus kezelőnek
        staticView.findViewById(R.id.staticBtn).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aszinkMess = new Intent(MainActivity.myIntent);
                aszinkMess.setPackage("com.example.bukodavi.myapplication");
                getActivity().sendBroadcast(aszinkMess);
            }
        });
        return staticView;
    }
}

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
        // létrehozunk egy új nézetet staticView néven, majd megadjuk neki, hogy a fragment_blank xml designből dolgozzon.
        View staticView = inflater.inflate(R.layout.fragment_blank, container, false);

        // Gomb beallitása, hogy tartalmat küldjön a statikus kezelőnek (onclicklistener) vizsgálja, hogy "kattintva" volt -e a gomb
        staticView.findViewById(R.id.staticBtn).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                //Új intent létrehozása aszinkMess néven, és megadjuk neki, hogy a MainActivity osztályunkből vegye az ott létrehozott myIntent változót.
                Intent aszinkMess = new Intent(MainActivity.myIntent);
                //beállítjuk az aszinkMess változónkat, hogy csak az ebből a packageből érkező activitást kezelje le.
                aszinkMess.setPackage("com.example.bukodavi.myapplication");
                getActivity().sendBroadcast(aszinkMess);
            }
        });
        return staticView;
    }
}

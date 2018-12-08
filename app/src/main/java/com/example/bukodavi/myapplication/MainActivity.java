package com.example.bukodavi.myapplication;

import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Intent deklarálása
    public static final String myIntent = "com.example.bukodavi.staticEvent";
    //BcReceiver osztály bevezetése
    BcReceiver brdReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //beállítjuk,hogy az activity_main xml design (layout) legyen a tartalom (setcontentView)
        setContentView(R.layout.activity_main);

        //savedinstancestate az előző tevékenységet jelöli, megvizsgáljuk, ha az null,
        // akkor új Tranzakciót kezdünk, és megjelenítjük a Blankfragment osztályunkat
        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.activityCont, new BlankFragment()).commit();
        }
        //BcReceiver osztály példányosítása brdReceiver néven
        brdReceiver = new BcReceiver();
    }

}

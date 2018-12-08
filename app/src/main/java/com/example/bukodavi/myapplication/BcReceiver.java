package com.example.bukodavi.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Toast;


public class BcReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        //segédváltozók létrehozása teszt jelleggel

        String mailFrom = "teszt@teszt.com";
        String mailSubject = "Thank you!";

            //Broadcast elkapása, és értesítés

        Toast.makeText(context,"Static üzenet küldve",Toast.LENGTH_LONG).show();

        //Abban az esetben ha az aszinkron üzenet hozzánk tartozik akkor
        if (intent.getAction().equals(MainActivity.myIntent)){
            Toast.makeText(context,"Üzenet érkezett",Toast.LENGTH_LONG).show();
            Toast.makeText(context,"Melynek feladója: " + mailFrom,Toast.LENGTH_SHORT).show();
            Toast.makeText(context,"tárgya: " + mailSubject,Toast.LENGTH_SHORT).show();
        }

    }
}

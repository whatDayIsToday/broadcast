package com.example.bukodavi.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    //Intent deklarálása
    public static final String myIntent = "com.example.bukodavi.staticEvent";

    BcReceiver brdReceiver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container, new Mainfragment()).commit();
        }

    }

    /* Broadcast küldése */

    public void sendBroadcast(View View){
        Intent i = new Intent();

       String mailFrom = "teszt@teszt.com";
       String mailSubject = "Thank you";

       i.putExtra("Mailfrom",mailFrom);
       i.putExtra("subject",mailSubject);



        /*
        i.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] { "teszt@teszt.com" });
        i.putExtra(android.content.Intent.EXTRA_SUBJECT,new String[] { "Elegseges program" });
        */
        i.setAction("com.example.bukodavi.myapplication");
        i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(i);
    }
}

package com.example.bukodavi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Broadcast küldése */

    public void sendBroadcast(View View){
        Intent i = new Intent();
        i.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] { "teszt@teszt.com" });
        i.putExtra(android.content.Intent.EXTRA_SUBJECT,new String[] { "Elegseges program" });
        i.setAction("com.example.bukodavi.myapplication");
        i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(i);
    }
}

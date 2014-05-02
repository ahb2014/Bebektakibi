package com.bebek.takip;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;

import com.bebek.takip.ses.NoiseAlert;

public class MainActivity extends Activity {
    public Button buttonbasla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);

        buttonbasla = (Button) findViewById(R.id.buttonBasla);

        //Listening to button event
        buttonbasla.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), NoiseAlert.class);
                // starting new activity
                startActivity(nextScreen);

            }
        });

    }
}
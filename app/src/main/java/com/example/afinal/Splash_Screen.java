package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Screen extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent i=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);
                finish();

            }
        }, SPLASH_DISPLAY_LENGTH);


    }

}

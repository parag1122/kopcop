package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        getSupportActionBar().setTitle("Contact Us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

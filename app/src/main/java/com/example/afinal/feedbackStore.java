package com.example.afinal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class feedbackStore extends AppCompatActivity {
    String feedbackMessage;
    String id;
    public feedbackStore(){}

    public feedbackStore(String feedbackMessage, String id) {
        this.feedbackMessage = feedbackMessage;
        this.id = id;
    }

    public String getFeedbackMessage() {
        return feedbackMessage;
    }

    public String getId() {
        return id;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_feedback);
        getSupportActionBar().setTitle("FeedBack");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


}

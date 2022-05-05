package com.example.teamproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FeedbackPage extends AppCompatActivity {

    private TextView goBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback_page);

        goBack = findViewById(R.id.back_botton);
        goBack.setOnClickListener(view -> finish());
    }
}

package com.example.teamproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AucklandCastlePage extends AppCompatActivity {

    private TextView goBack;
    private Button orderNow;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.auckland_castle_page);

        goBack = findViewById(R.id.back_botton);
        goBack.setOnClickListener(view -> finish());

        orderNow = findViewById(R.id.order_now);
        orderNow.setOnClickListener(view -> {
            Intent intent = new Intent(AucklandCastlePage.this,AfterClickOrderNow.class);
            startActivity(intent);
        });
    }
}

package com.example.teamproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AlnwickCastlePage extends AppCompatActivity {

    private TextView goBack;
    private Button orderNow;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alnwick_castle_page);

        goBack = findViewById(R.id.back_botton);
        goBack.setOnClickListener(view -> finish());

        orderNow = findViewById(R.id.order_now);
        orderNow.setOnClickListener(view -> {
            Intent intent = new Intent(AlnwickCastlePage.this,AfterClickOrderNow.class);
            startActivity(intent);
        });
    }
}

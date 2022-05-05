package com.example.teamproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SettingPage extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_page);

        LinearLayout aboutOption = findViewById(R.id.about);
        aboutOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingPage.this,AboutPage.class);
                startActivity(intent);
            }
        });

        LinearLayout legalOption = findViewById(R.id.legal);
        legalOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingPage.this,LegalPage.class);
                startActivity(intent);
            }
        });


    }
}

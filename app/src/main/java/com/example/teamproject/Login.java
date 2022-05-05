package com.example.teamproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn = findViewById(R.id.Register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.login);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {


                Intent intent1 = new Intent(Login.this, MainPageAfterLogin.class);
                startActivity(intent1);
            }
        });
    }
}

package com.example.teamproject;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    private EditText reg_username;
    private EditText reg_password;
    private EditText confirmPassword;
    private EditText reg_firstname;
    private EditText reg_lastname;
    private EditText reg_phone;
    private Button btn_register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        reg_username = findViewById(R.id.registerUsername);
        reg_password = findViewById(R.id.registerPassword);
        confirmPassword = findViewById(R.id.ConfirmPassword);
        reg_firstname = findViewById(R.id.firstname);
        reg_lastname = findViewById(R.id.lastname);
        reg_phone = findViewById(R.id.phone);
        btn_register = findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new RegisterButton());
    }

    public class RegisterButton implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            //get the input information
            String username = reg_username.getText().toString().trim();
            String password = reg_password.getText().toString().trim();
            String conPassword = confirmPassword.getText().toString().trim();
            String firstName = reg_firstname.getText().toString().trim();
            String lastName = reg_lastname.getText().toString().trim();
            String phone = reg_phone.getText().toString().trim();

            //check the input,if there has empty EditText or the passwords aren't equal,alarm.
            //If reg successful,go to the main page
            if(TextUtils.isEmpty(username) || TextUtils.isEmpty(password) || TextUtils.isEmpty(conPassword) ||
                    TextUtils.isEmpty(firstName) || TextUtils.isEmpty(lastName) || TextUtils.isEmpty(phone)){
                Toast.makeText(Register.this, "Can't have empty EditText", Toast.LENGTH_SHORT).show();
            }else{
                if(!TextUtils.equals(password,conPassword)){
                    Toast.makeText(Register.this, "Check the passwords", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(Register.this, MainPageAfterLogin.class);
                    startActivity(intent);
                }
            }
        }
    }

}

package com.example.covidscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText etSchoolName, etSchoolEmail, etPassword, etReenterPassword;
    Button btnRegisterSchool;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etSchoolName = findViewById(R.id.etSchoolName);
        etSchoolEmail = findViewById(R.id.etSchoolEmail);
        etPassword = findViewById(R.id.etPassword);
        etReenterPassword = findViewById(R.id.etReenterPassword);
        btnRegisterSchool = findViewById(R.id.btnRegSchool);

        btnRegisterSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
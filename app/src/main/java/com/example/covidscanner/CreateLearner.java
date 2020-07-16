package com.example.covidscanner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreateLearner extends AppCompatActivity {

    EditText etLearnerName, etLearnerSurname, etLearnerGrade;
    TextView scanBarcode;
    Button btnSubmitLearner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_learner);

        etLearnerName = findViewById(R.id.etLearnerName);
        etLearnerSurname = findViewById(R.id.etLearnerSurname);
        etLearnerGrade = findViewById(R.id.etLearnersGrade);
        scanBarcode = findViewById(R.id.tvScan);
        btnSubmitLearner = findViewById(R.id.btnSubmitLearner);

        btnSubmitLearner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        scanBarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateLearner.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
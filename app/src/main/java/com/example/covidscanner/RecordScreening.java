package com.example.covidscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class RecordScreening extends AppCompatActivity {

    TextView tvLearnerName, tvGrade, tvCode;
    CheckBox cbTravel, cbContact, cbSymptoms;
    EditText etTemp;
    Button btnSubmitScreening;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_screening);

        tvLearnerName = findViewById(R.id.tvLearnerName);
        tvGrade = findViewById(R.id.tvGrade);
        tvCode = findViewById(R.id.tvCode);
        cbTravel = findViewById(R.id.cbTravel);
        cbContact = findViewById(R.id.cbContact);
        cbSymptoms = findViewById(R.id.cbSymptoms);
        etTemp = findViewById(R.id.etTemp);
        btnSubmitScreening = findViewById(R.id.btnSubmitScreening);

        btnSubmitScreening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }
}
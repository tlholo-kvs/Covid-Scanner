package com.example.covidscanner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

public class MenuActivity extends AppCompatActivity {

    ImageView ivIcon;
    Button btnScanData, btnSeeData, btnNewLearner;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ivIcon = findViewById(R.id.ivIcon);
        btnScanData = findViewById(R.id.btnScanData);
        btnSeeData = findViewById(R.id.btnSeeData);
        btnNewLearner = findViewById(R.id.btnNewLearner);
        actionBar = getSupportActionBar();
        actionBar.setTitle("School");

        btnScanData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnSeeData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent scanIntent = new Intent(MenuActivity.this, RecordScreening.class);
                startActivity(scanIntent);
            }
        });

        btnNewLearner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       switch (item.getItemId())
       {
           case R.id.itmLock:

               break;
           default:
               break;
       }
        return super.onOptionsItemSelected(item);
    }
}
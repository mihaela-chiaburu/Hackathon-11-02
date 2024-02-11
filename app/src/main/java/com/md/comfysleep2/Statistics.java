package com.md.comfysleep2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class Statistics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        findViewById(R.id.backPage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        // Assuming you have a reference to the ProgressBar
        ProgressBar progressBar = findViewById(R.id.progressBar);

        // Set the progress programmatically
        int percentage = 80; // Change this to your desired percentage
        progressBar.setProgress(percentage);

        ProgressBar progressBar2 = findViewById(R.id.progressBar2);
        int percentage2 = 60;
        progressBar2.setProgress(percentage2);
        ProgressBar progressBar3 = findViewById(R.id.progressBar3);
        int percentage3 = 40;
        progressBar3.setProgress(percentage3);
        ProgressBar progressBar4 = findViewById(R.id.progressBar4);
        int percentage4 = 40;
        progressBar4.setProgress(percentage4);
        ProgressBar progressBar5 = findViewById(R.id.progressBar5);
        int percentage5 = 70;
        progressBar5.setProgress(percentage5);
        ProgressBar progressBar6 = findViewById(R.id.progressBar6);
        int percentage6 = 80;
        progressBar6.setProgress(percentage6);
        ProgressBar progressBar7 = findViewById(R.id.progressBar7);
        int percentage7 = 60;
        progressBar7.setProgress(percentage7);

        ProgressBar progressBar8 = findViewById(R.id.progressBar8);
        int percentage8 = 85;
        progressBar8.setProgress(percentage8);

    }
}

package com.md.comfysleep2;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private TextView progressText;
    private int remainingHours = 43; // Set the total number of hours remaining
    private int progress = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar=findViewById(R.id.progress_bar);
        progressText = findViewById(R.id.progress_text);

        // Calculate progress based on remaining hours
        progress = (int) (remainingHours); // Assuming each hour is 12.5% of progress

        // Set progress and progress text
        progressText.setText(String.valueOf(progress) + "%");
        progressBar.setProgress(progress);

        findViewById(R.id.nextPage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Statistics.class));
            }
        });
    }
}

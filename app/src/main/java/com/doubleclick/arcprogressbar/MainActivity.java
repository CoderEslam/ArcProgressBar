package com.doubleclick.arcprogressbar;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RoundProgressBar roundProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = findViewById(R.id.textView);
        roundProgressBar = findViewById(R.id.roundProgressBar);
        roundProgressBar.setOnProgressChangeListner(progess -> {
            int xx = (int) progess;
            Log.e("progess", xx + "");
            textView.setText(xx + "");
        });
    }

    public void updateProgress(View view) {
        float progress = new Random().nextInt(100);
        roundProgressBar.setCurrentprogess(progress, true);
    }
}

package com.example.mybmi;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView show = findViewById(R.id.tcShowBMI);
        ImageView img = findViewById(R.id.ivShow);
        double bmi = getIntent().getDoubleExtra("bmi", 0);
        if (bmi<18.5){
            show.setText("體重過輕");
            img.setImageResource(R.drawable.a3);
        }else if (bmi<=24){
            show.setText("體重正常");
            img.setImageResource(R.drawable.a2);
        }else if (bmi>24){
            show.setText("體重過重");
            img.setImageResource(R.drawable.a1);
        }
    }

    public void Goback(View view) {
        finish();
    }
}
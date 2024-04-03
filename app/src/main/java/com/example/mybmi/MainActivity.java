package com.example.mybmi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcBMI(View view){
        DecimalFormat df = new DecimalFormat(".00");
        EditText height = findViewById(R.id.etHeight);
        EditText weight = findViewById(R.id.etWeight);
        double h = Double.parseDouble(height.getText().toString());
        double w = Double.parseDouble(weight.getText().toString());
        double bmi = w / (h/100.0 * h/100.0);
        bmi = Double.parseDouble(df.format(bmi));
        String result = getString(R.string.strShowbmi) + bmi;
        TextView show = findViewById(R.id.tvShow);
        show.setText(result);
    }

    public void GoNext(View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
    }
}
package com.example.mybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;
import java.util.ArrayList;


public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        List<String> list = new ArrayList<>();
        list.add("番茄");
        list.add("香蕉");
        list.add("橘子");
        list.add("蘋果");
        list.add("梨子");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spfruits = findViewById(R.id.spFruit);
        TextView tvshow1 = findViewById(R.id.tvShow1);
        ListView lvfruit = findViewById(R.id.lvFruit);
        spfruits.setAdapter(adapter);
        lvfruit.setAdapter(adapter);

        spfruits.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Overridea
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    tvshow1.setText(list.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        lvfruit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    tvshow1.setText(list.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
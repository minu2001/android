package com.example.intent_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView text;
    Button btnSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnSecond = findViewById(R.id.btnSecond);
        text = findViewById(R.id.text);

        Intent secondIntent = getIntent();
        String readname = secondIntent.getStringExtra("name");
        int year = secondIntent.getIntExtra("birth",0);
        year = 2024 - year + 1;
        text.setText("name : " + readname + '\n' + "year : " + year);
    }
}
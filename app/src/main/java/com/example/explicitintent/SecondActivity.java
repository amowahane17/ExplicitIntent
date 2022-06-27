package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView lEarn, oK;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lEarn = findViewById(R.id.learn);
        oK = findViewById(R.id.ok);

        Intent intent =getIntent();
        data = intent.getStringExtra("dataname");

        lEarn.setText("Hello " +data);

        oK.setText("HI " +data);


    }
}
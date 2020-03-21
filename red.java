package com.example.assign4;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class red extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.red);
        ConstraintLayout layout = findViewById(R.id.cl);
        layout.setBackgroundColor(Color.RED);
    }
}
package com.example.assign4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;

public class black extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.black);
        ConstraintLayout layout=findViewById(R.id.cl);
        layout.setBackgroundColor(Color.BLACK);
    }
}



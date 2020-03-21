package com.example.assign2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout lay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            lay = findViewById(R.id.lay);
        final ImageView iv = new ImageView(this);
        iv.setImageResource(R.drawable.ic_launcher_background);
        lay.addView(iv);
    }
}

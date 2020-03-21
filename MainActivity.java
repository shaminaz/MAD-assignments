package com.example.assign1;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout lay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lay = findViewById(R.id.lay);
        final TextView tv = new TextView(this);
        lay.addView(tv);
        new CountDownTimer(5000,3000)
        {
            public void onTick(long millisUntilFinished)
            {
                tv.setText(" Hello, my name is SHAMINAZ");
                tv.setTypeface(tv.getTypeface(),Typeface.BOLD);
                tv.setTextColor(Color.BLUE);
                tv.setTextSize(85);
            }

            public void onFinish() {
                tv.setTypeface(tv.getTypeface(),Typeface.ITALIC);
                tv.setTextColor(Color.BLACK);

            }
        }.start();



    }
}


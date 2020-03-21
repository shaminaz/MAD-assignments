package com.example.assign4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        switch(menuItem.getItemId()){

            case R.id.black:
                Intent intent=new Intent(MainActivity.this,black.class);
                startActivity(intent);
                return true;
            case R.id.red:
                Intent intent1=new Intent(MainActivity.this,red.class);
                startActivity(intent1);
                return true;
            case R.id.yellow:
                Intent intent2=new Intent(MainActivity.this,yellow.class);
                startActivity(intent2);
                return true;
            default:
                super.onOptionsItemSelected(menuItem);
        }
        return true;
    }
}

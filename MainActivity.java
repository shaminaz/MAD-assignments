package com.example.assign05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabItem t1,t2,t3,t4,t5;
    public PagerAdapter pagerAdapter;
FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout) findViewById(R.id.tlyt);
        t1=(TabItem) findViewById(R.id.rl);
        t2=(TabItem) findViewById(R.id.cl);
        t3=(TabItem) findViewById(R.id.ll);
        t4=(TabItem) findViewById(R.id.fl);
        t5=(TabItem) findViewById(R.id.tl);
        viewPager=(ViewPager) findViewById(R.id.vp);
        pagerAdapter=new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition() == 0) {
                    pagerAdapter.notifyDataSetChanged();
                } else if(tab.getPosition() == 1) {
                    pagerAdapter.notifyDataSetChanged();
                }      else if(tab.getPosition() == 2) {
                    pagerAdapter.notifyDataSetChanged();
                }           else if(tab.getPosition() == 3) {
                    pagerAdapter.notifyDataSetChanged();
                }              else if(tab.getPosition() == 4){
                                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        fab=findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Floating Button Clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }
}

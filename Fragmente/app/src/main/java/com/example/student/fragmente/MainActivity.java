package com.example.student.fragmente;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements Tab_1.SendMessage{

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerA viewPagerA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerA = new ViewPagerA(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerA);
        tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
    }


    @Override
    public void sendData(String message) {
        String tag = "android:switcher:" + R.id.viewPager + ":" + 1;
        Tab_2 f = (Tab_2) getSupportFragmentManager().findFragmentByTag(tag);
        f.displayReceivedData(message);
    }
}

package com.example.student.fragmente;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerA extends FragmentPagerAdapter {
    public ViewPagerA (FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0) {
            fragment = new Tab_1();
        } else if (position == 1){
            fragment = new Tab_2();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0){
            title = "Pagina1";
        } else if (position == 1){
            title = "Pagina2";
        }
        return title;
    }
}

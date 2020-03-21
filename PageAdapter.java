package com.example.assign05;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    private  int numoftabs;

    public PageAdapter(@NonNull FragmentManager fm, int numoftabs) {
        super(fm);
        this.numoftabs=numoftabs;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new rl();
            case 1:
                return new cl();
            case 2:
                return new ll();
            case 3:
                return new fl();
            case 4:
                return new tl();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numoftabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}

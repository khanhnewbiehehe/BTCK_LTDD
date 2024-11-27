package com.example.btck.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class NavigationAdapter extends FragmentStatePagerAdapter {
    public NavigationAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FeaturedFragment();
            case 1:
                return new FeedFragment();
            case 2:
                return new SettingsFragment();
            default:
                return new FeaturedFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}

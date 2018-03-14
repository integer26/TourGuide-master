package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by giorgioschirano on 13/03/18.
 */

public class PageAdapterFragment extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Matera", "Taranto", "Bari", "Lecce" };
    private Context context;

    public PageAdapterFragment(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0){
            return City1Frag.newInstance(position + 1);
        }else if(position == 1){
            return City2Frag.newInstance(position + 1);
        }else if(position == 2){
            return City3Frag.newInstance(position + 1);
        }else {
            return City4Frag.newInstance(position + 1);
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}

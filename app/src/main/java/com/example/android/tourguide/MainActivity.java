package com.example.android.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        ViewPager mViewPager = findViewById ( R.id.viewPagerMain );
        mViewPager.setAdapter ( new PageAdapterFragment ( getSupportFragmentManager (),
                MainActivity.this ) );

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById ( R.id.tab_id );
        tabLayout.setupWithViewPager ( mViewPager );


    }


}

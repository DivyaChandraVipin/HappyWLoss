package com.acadgild.weightlossmagic;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by DivyaVipin on 3/2/2017.
 */

public class WeightLossFoods extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weightloss_foods);

        TabLayout tabLayout=(TabLayout)findViewById(R.id.tablayout);

        tabLayout.addTab(tabLayout.newTab().setText("Chicken"));
        tabLayout.addTab(tabLayout.newTab().setText("Eggs"));
        tabLayout.addTab(tabLayout.newTab().setText("Chia Seeds"));
        tabLayout.addTab(tabLayout.newTab().setText("Chilli Pepper"));
        tabLayout.addTab(tabLayout.newTab().setText("Leafy Green"));
        tabLayout.addTab(tabLayout.newTab().setText("Salmon"));
        tabLayout.addTab(tabLayout.newTab().setText("Cruciferous Vegetables"));
        tabLayout.addTab(tabLayout.newTab().setText("Potato"));
        tabLayout.addTab(tabLayout.newTab().setText("Tuna"));
        tabLayout.addTab(tabLayout.newTab().setText("Beans and Legumes"));


       // tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        Pager pager = new Pager(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}

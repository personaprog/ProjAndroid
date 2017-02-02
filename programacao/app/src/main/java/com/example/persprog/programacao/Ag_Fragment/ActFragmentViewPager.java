package com.example.persprog.programacao.Ag_Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.R;

/**
 * Created by persprog on 31/01/17.
 */

public class ActFragmentViewPager extends Lifecycle {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentviewpager);


        // ViewPager
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new TabsAdapter(getSupportFragmentManager()));

        // Configura as Tabs
        final ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("Frag 1").setTabListener(new MyTabListener(viewPager, 0)));
        actionBar.addTab(actionBar.newTab().setText("Frag 2").setTabListener(new MyTabListener(viewPager, 1)));
        actionBar.addTab(actionBar.newTab().setText("Frag 3").setTabListener(new MyTabListener(viewPager, 2)));

        // Se o ViewPager troca de página, atualiza a Tab.
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int idx) {
                // Se fizer swipe no ViewPager, atualiza a tab
                actionBar.setSelectedNavigationItem(idx);
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }

        });
    }
}

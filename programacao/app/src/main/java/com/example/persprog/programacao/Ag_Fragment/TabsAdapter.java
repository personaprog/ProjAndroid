package com.example.persprog.programacao.Ag_Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Ricardo Lecheta on 24/12/2014.
 */
public class TabsAdapter extends FragmentPagerAdapter {
    public TabsAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int idx) {
        if (idx == 0) {
            return new ViewPager1();
        } else if (idx == 1) {
            return new ViewPager2();
        }
        return new ViewPager3();
    }

}

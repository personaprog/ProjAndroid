package com.example.persprog.programacao.Ac_ActionBar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;

/**
 * Created by persprog on 25/01/17.
 */

public class ActTabListener extends Lifecycle {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();

        actionBar.setNavigationMode((ActionBar.NAVIGATION_MODE_TABS));
        actionBar.addTab(actionBar.newTab().setText("Layout").setTabListener(new MyTabListener(this,1)));
        actionBar.addTab(actionBar.newTab().setText("Bundle").setTabListener(new MyTabListener(this,2)));
        actionBar.addTab(actionBar.newTab().setText("Sair").setTabListener(new MyTabListener(this,3)));
    }


}

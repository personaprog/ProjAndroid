package com.example.persprog.programacao.Ag_Fragment;

import android.os.Bundle;
import android.support.v7.app.ActionBar;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.Ag_Fragment.MyTabListener1;
import com.example.persprog.programacao.R;


/**
 * Created by persprog on 31/01/17.
 */

public class ActFragmentPrincipal extends Lifecycle{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentprincipal);
        ActionBar actionBar = getSupportActionBar();


        actionBar.setNavigationMode((ActionBar.NAVIGATION_MODE_TABS));;



        actionBar.addTab(actionBar.newTab().setText("Grag1").setTabListener(new MyTabListener1(this,new Fragment1())));

        actionBar.addTab(actionBar.newTab().setText("Grag2").setTabListener(new MyTabListener1(this,new Fragment2())));

        actionBar.addTab(actionBar.newTab().setText("Grag3").setTabListener(new MyTabListener1(this,new Fragment3())));
    }
}

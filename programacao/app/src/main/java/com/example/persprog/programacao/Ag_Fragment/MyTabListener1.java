package com.example.persprog.programacao.Ag_Fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;

import com.example.persprog.programacao.R;

/**
 * Created by Ricardo Lecheta on 24/12/2014.
 */
public class MyTabListener1 implements ActionBar.TabListener {
    private Context context;
    private Fragment frag;

    public MyTabListener1(Context context, Fragment frag) {
        this.context = context;
        this.frag = frag;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        // Troca o fragment dinamicamente ao clicar na Tab
        ft.replace(R.id.layoutFrag, this.frag, null);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        // Chamado quando a tab perde o foco (se outra tab é selecionada)
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        // Chamado quando uma tab é selecionada novamente.
    }
}

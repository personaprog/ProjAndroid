package com.example.persprog.programacao.Af_adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.persprog.programacao.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by persprog on 26/01/17.
 */

public class Adapterexemplos extends BaseAdapter {
    private Context context;

    private List<Exemplos> list;

    public Adapterexemplos(Context context, List<Exemplos> list){
        this.list = list;
        this.context = context;

    }
    @Override
    public Exemplos getItem(int position) {
        return list.get( position );
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public int getCount() {
        return list.size();
    }


}

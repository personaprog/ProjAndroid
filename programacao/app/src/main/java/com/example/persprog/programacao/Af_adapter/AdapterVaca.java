package com.example.persprog.programacao.Af_adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;

import android.widget.TextView;

import com.example.persprog.programacao.R;

/**
 * Created by persprog on 26/01/17.
 */

public class AdapterVaca extends BaseAdapter {
    private Context context;

    public AdapterVaca(Context context) {
        this.context = context;
    }

    private String[] arrayvacas = new String[] {"Vaca1", "Vaca2", "Vaca3", "Vaca4"};



    @Override
    public int getCount() {
        return arrayvacas.length;
    }

    @Override
    public Object getItem(int position) {
        return arrayvacas[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String vaca = arrayvacas[position];
        View view = LayoutInflater.from(context).inflate(R.layout.inflate_textview,parent,false);
        TextView t = (TextView) view.findViewById(R.id.edit_inflate);
        t.setText(vaca);

        return t;
    }
}

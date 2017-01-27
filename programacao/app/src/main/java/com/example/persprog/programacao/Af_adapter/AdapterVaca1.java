package com.example.persprog.programacao.Af_adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.persprog.programacao.R;

import java.util.List;

/**
 * Created by persprog on 26/01/17.
 */

public class AdapterVaca1 extends BaseAdapter {
    private Context context;


    private  final  List<Vacas> vacas;

    public AdapterVaca1( Context context,List<Vacas> vacas) {
        this.vacas = vacas;
        this.context = context;
    }

    @Override
    public int getCount() {
        return vacas != null ? vacas.size():0 ;
    }

    @Override
    public Object getItem(int position) {
        return vacas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_vacas,parent,false);
        TextView t =  (TextView) view.findViewById(R.id.nomevaca);
        ImageView im =  (ImageView) view.findViewById(R.id.fotovaca);
        Vacas vaca = vacas.get(position);
        t.setText(vaca.nome);
        im.setImageResource(vaca.foto);
        return view;
    }
}

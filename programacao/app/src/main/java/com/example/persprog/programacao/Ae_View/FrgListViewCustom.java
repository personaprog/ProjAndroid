package com.example.persprog.programacao.Ae_View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.Af_adapter.AdapterVaca1;
import com.example.persprog.programacao.Af_adapter.Vacas;
import com.example.persprog.programacao.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by persprog on 26/01/17.
 */

public class FrgListViewCustom extends Fragment{
    private ListView listView;
    private List<Vacas> vacas = Vacas.getVacas();;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_listviewcustom,container,false);
        ListView listView = (ListView) view.findViewById(R.id.listviewcustom1);
        AdapterVaca1 advacas = new AdapterVaca1(getActivity(), vacas);
        listView.setAdapter(advacas);
        listView.setOnItemClickListener(OnItemClickExemplo());
        return view;
    }

    private AdapterView.OnItemClickListener OnItemClickExemplo() {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),"Item:" + Integer.valueOf(position + 1) + " Nome: " + vacas.get(position).getNome().toString(),Toast.LENGTH_SHORT).show();

            }

        };
    };


}

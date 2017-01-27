package com.example.persprog.programacao.Ae_View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ListView;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.Af_adapter.AdapterVaca;
import com.example.persprog.programacao.Af_adapter.AdapterVaca1;
import com.example.persprog.programacao.Af_adapter.Vacas;
import com.example.persprog.programacao.R;

import java.util.List;

/**
 * Created by persprog on 26/01/17.
 */

public class ActListViewCustom extends Lifecycle implements View.OnClickListener {
    private ListView listView;
    private List<Vacas> vacas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewcustom);
        listView = (ListView) findViewById(R.id.listviewcustom1);
        vacas = Vacas.getVacas();
        listView.setAdapter(new AdapterVaca1(this, vacas));

    }

    @Override
    public void onClick(View v) {

    }
}

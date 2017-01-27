package com.example.persprog.programacao.Ae_View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import android.widget.AdapterView.OnItemClickListener;
import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.Af_adapter.AdapterVaca;
import com.example.persprog.programacao.R;

/**
 * Created by persprog on 26/01/17.
 */

public class ActListView extends Lifecycle implements OnItemClickListener{
    private ListView listview ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        try {
            listview = (ListView) findViewById(R.id.listviewact);
            listview.setAdapter(new AdapterVaca(this));
            listview.setOnItemClickListener(this);
        }catch (Exception e){}


        }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String s = (String) parent.getAdapter().getItem(position);
        Toast.makeText(this, "Texto Selecionado: " + s + " posição: " + position,Toast.LENGTH_SHORT);
    }
}

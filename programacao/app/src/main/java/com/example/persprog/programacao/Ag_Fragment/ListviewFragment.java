package com.example.persprog.programacao.Ag_Fragment;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.persprog.programacao.R;

import java.util.List;

/**
 * Created by persprog on 02/02/17.
 */

public class ListviewFragment {



    public ListView ListVi(final View view, final Context context, final String[] items, final AdapterView.OnItemClickListener onclick){
        ListView list = (ListView) view.findViewById( R.id.listActivityFragment);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(context,android.R.layout.simple_expandable_list_item_1,  items);
        list.setAdapter(dataAdapter);
        list.setOnItemClickListener(onclick);
        return null;

    }
}

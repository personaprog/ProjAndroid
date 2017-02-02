package com.example.persprog.programacao.Ae_View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.persprog.programacao.R;
import com.example.persprog.programacao.Aa_Activity.Lifecycle;

/**
 * Created by persprog on 25/01/17.
 */

public class FrgSpinner extends Fragment {
    private  int[] imagens ={R.drawable.cow1,R.drawable.cow2,R.drawable.cow3,R.drawable.cow4};
    private  String[] vacas ={"Vaca 1","Vaca 2","Vaca 3","Vaca 4",};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_spinner,container,false);



        final ImageView imageView = (ImageView) view.findViewById(R.id.imgvaca);
        final Spinner spinner = (Spinner) view.findViewById(R.id.spinervaca);
        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item,vacas);
        adaptor.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adaptor);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onNothingSelected(AdapterView<?> parent) {      }

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imageView.setImageResource(imagens[position]);
            }
        });
        return view;

    }
}

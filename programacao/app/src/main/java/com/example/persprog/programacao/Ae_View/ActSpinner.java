package com.example.persprog.programacao.Ae_View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.persprog.programacao.R;
import com.example.persprog.programacao.Aa_Activity.Lifecycle;

/**
 * Created by persprog on 25/01/17.
 */

public class ActSpinner extends Lifecycle {
    private  int[] imagens ={R.drawable.cow1,R.drawable.cow2,R.drawable.cow3,R.drawable.cow4};
    private  String[] vacas ={"Vaca 1","Vaca 2","Vaca 3","Vaca 4",};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        final ImageView imageView = (ImageView) findViewById(R.id.imgvaca);
        final Spinner spinner = (Spinner) findViewById(R.id.spinervaca);
        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,vacas);
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


    }
}

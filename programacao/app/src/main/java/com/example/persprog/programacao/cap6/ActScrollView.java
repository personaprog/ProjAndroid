package com.example.persprog.programacao.cap6;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.example.persprog.programacao.R;
import com.example.persprog.programacao.ca4.Lifecycle;
/**
 * Created by persprog on 24/01/17.
 */
public class ActScrollView extends Lifecycle {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrollview);
        LinearLayout layout = (LinearLayout) findViewById(R.id.linLayout);
        for (int i = 0; i < 100; i++ ){
            TextView text = new TextView(this);
//            Obrigátorio
            text.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
            text.setText("Texto:" + i);
            layout.addView(text);
        }

//        Inflater
        for (int i = 101; i < 200; i++ ){
            LayoutInflater inflater = LayoutInflater.from(this);
            TextView text2 = (TextView)   inflater.inflate(R.layout.inflate_textview, layout,false);
//            Obrigátorio
             text2.setText("Texto Cp:" + i);
            layout.addView(text2);
        }
    }

}

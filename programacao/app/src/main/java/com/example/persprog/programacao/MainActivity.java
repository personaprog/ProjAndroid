package com.example.persprog.programacao;



import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.persprog.programacao.ca4.Bundle_Exemp;
import com.example.persprog.programacao.ca4.Lifecycle;
import com.example.persprog.programacao.cap3.Layout;
import com.example.persprog.programacao.cap6.ActFrameLayout;
import com.example.persprog.programacao.cap6.ActGridLayout;
import com.example.persprog.programacao.cap6.ActLinearLayout;
import com.example.persprog.programacao.cap6.ActRelativeLayout;
import com.example.persprog.programacao.cap6.ActScrollView;
import com.example.persprog.programacao.cap6.ActTabelLayout1;
import com.example.persprog.programacao.cap6.ActTableLayout;

public class MainActivity extends Lifecycle {
    private  final Context context = this;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = (LinearLayout) findViewById(R.id.layoutlista);
        LayoutInflater inflater = LayoutInflater.from(this);


        Button btnlayout =  (Button)  inflater.inflate(R.layout.inflatebutton, layout,false);
        btnlayout.setText("Layout");
        btnlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activelayout = new Intent(context, Layout.class);
                startActivity(activelayout);
            }
        });
        layout.addView(btnlayout);


        Button btnbundle = (Button)  inflater.inflate(R.layout.inflatebutton, layout,false);
        btnbundle.setText("Bundle");
        btnbundle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent activebundle = new Intent(context, Bundle_Exemp.class);

                Bundle params = new Bundle();
                params.putString("nome", TAG);
                activebundle.putExtras(params);
                startActivity(activebundle);
            }
        });
        layout.addView(btnbundle);

        Button btnframelayout =(Button)  inflater.inflate(R.layout.inflatebutton, layout,false);
        btnframelayout.setText("Frame Layout");
        btnframelayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent activeInt = new Intent(context, ActFrameLayout.class);
                startActivity(activeInt);
            }
        });
        layout.addView(btnframelayout);


        Button btnlinearlayout =(Button)  inflater.inflate(R.layout.inflatebutton, layout,false);
        btnlinearlayout.setText("Linear Layout");
        btnlinearlayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent activeInt = new Intent(context, ActLinearLayout.class);
                startActivity(activeInt);
            }
        });
        layout.addView(btnlinearlayout);


        Button btntablelayout =(Button)  inflater.inflate(R.layout.inflatebutton, layout,false);
        btntablelayout.setText("TableLayout shrinkColumns");
        btntablelayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent activeInt = new Intent(context, ActTableLayout.class);
                startActivity(activeInt);
            }
        });
        layout.addView(btntablelayout);

        Button btntablelayout1 =(Button)  inflater.inflate(R.layout.inflatebutton, layout,false);
        btntablelayout1.setText("TableLayout strechColumns");
        btntablelayout1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent activeInt = new Intent(context, ActTabelLayout1.class);
                startActivity(activeInt);
            }
        });
        layout.addView(btntablelayout1);


        Button btngridlayout =(Button)  inflater.inflate(R.layout.inflatebutton, layout,false);
        btngridlayout.setText("GridLayout");
        btngridlayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent activeInt = new Intent(context, ActGridLayout.class);
                startActivity(activeInt);
            }
        });
        layout.addView(btngridlayout);



        Button btnrelativelayout =(Button)  inflater.inflate(R.layout.inflatebutton, layout,false);
        btnrelativelayout.setText("RelativeLayout");
        btnrelativelayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent activeInt = new Intent(context, ActRelativeLayout.class);
                startActivity(activeInt);
            }
        });
        layout.addView(btnrelativelayout);






        Button btnscrollview =(Button)  inflater.inflate(R.layout.inflatebutton, layout,false);
        btnscrollview.setText("GridLayout");
        btnscrollview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent activeInt = new Intent(context, ActScrollView.class);
                startActivity(activeInt);
            }
        });
        layout.addView(btnscrollview);





    }


}
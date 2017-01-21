package com.example.persprog.programacao;



import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.persprog.programacao.ca4.Bundle_Exemp;
import com.example.persprog.programacao.ca4.Lifecycle;
import com.example.persprog.programacao.cap3.Layout;

import static java.security.AccessController.getContext;

public class MainActivity extends Lifecycle {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
           Button btnlayout =  (Button) findViewById(R.id.btn_Layout);

            btnlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activelayout = new Intent(getContext(), Layout.class);
                startActivity(activelayout);
            }
        });

        Button btnbundle = (Button) findViewById(R.id.btnbundle);

        btnbundle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent activebundle = new Intent(getContext(), Bundle_Exemp.class);
                Bundle params = new Bundle();
                params.putString("nome", TAG);
                activebundle.putExtras(params);
                startActivity(activebundle);
            }
        });


    }



    private Context getContext(){
        return this;
    }
}
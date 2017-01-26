package com.example.persprog.programacao.Ab_Basico;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.R;

/**
 * Created by persprog on 21/01/17.
 */

public class ActBundle extends Lifecycle {
    final Context context = this;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);



        Button btnBundle = (Button) findViewById(R.id.btnbundle);
        btnBundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editbundle);
                Intent itbundle = new Intent(context, ActGetBundle.class);
                Bundle params = new Bundle();
                params.putString("nome",editText.getText().toString());
                itbundle.putExtras(params);
                startActivity(itbundle);

            }
        });




    }


}

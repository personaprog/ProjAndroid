package com.example.persprog.programacao.Ab_Basico;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.R;

/**
 * Created by persprog on 26/01/17.
 */

public class ActGetBundle extends Lifecycle {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getbundle);
        TextView txbundle = (TextView) findViewById(R.id.textbundle);
        Intent intBundle = getIntent();
        Bundle args = intBundle.getExtras();
        txbundle.setText(args.getString("nome"));
    }
}

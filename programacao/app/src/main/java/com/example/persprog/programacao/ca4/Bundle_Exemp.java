package com.example.persprog.programacao.ca4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.example.persprog.programacao.R;

/**
 * Created by persprog on 21/01/17.
 */

public class Bundle_Exemp extends Lifecycle{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bundleget);
        TextView txbundle = (TextView) findViewById(R.id.textbundle);
        Intent intBundle = getIntent();
        Bundle args = intBundle.getExtras();
        txbundle.setText(args.getString("nome"));


    }


}

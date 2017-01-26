package com.example.persprog.programacao.Ab_Basico;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.persprog.programacao.R;
import com.example.persprog.programacao.Aa_Activity.Lifecycle;

/**
 * Created by persprog on 19/01/17.
 */

public class Layout extends Lifecycle {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_layout);
    }
}

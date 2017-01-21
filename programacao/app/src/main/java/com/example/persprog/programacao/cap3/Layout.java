package com.example.persprog.programacao.cap3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.persprog.programacao.R;
import com.example.persprog.programacao.ca4.Lifecycle;

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

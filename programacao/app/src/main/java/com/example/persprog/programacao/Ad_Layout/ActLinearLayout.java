package com.example.persprog.programacao.Ad_Layout;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.persprog.programacao.R;
import com.example.persprog.programacao.Aa_Activity.Lifecycle;

/**
 * Created by persprog on 24/01/17.
 */

public class ActLinearLayout extends Lifecycle {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout);
    }
}
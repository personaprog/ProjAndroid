package com.example.persprog.programacao.cap7;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.persprog.programacao.R;
import com.example.persprog.programacao.ca4.Lifecycle;

/**
 * Created by persprog on 24/01/17.
 */

public class Acttextview extends Lifecycle {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);
    }
}

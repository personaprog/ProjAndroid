package com.example.persprog.programacao;



import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;

public class MainActivity extends Lifecycle {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
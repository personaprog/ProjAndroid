package com.example.persprog.programacao.cap3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

/**
 * Created by persprog on 21/01/17.
 */

public class LogCat extends AppCompatActivity{
    private static final String TAG = "Personaprog";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v(TAG,"log verdose");                              // verbose nunca deve ser usada no app exceto no desenvolvimento
        Log.d(TAG,"log debug");                                // debug
        Log.i(TAG,"log info");                                 //informação
        Log.e(TAG,"Log erro",new RuntimeException("errro"));   //erro
        Log.w(TAG,"log verdose");                              //alerta
    

    }
}
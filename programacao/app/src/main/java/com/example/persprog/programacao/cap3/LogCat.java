package com.example.persprog.programacao.cap3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by persprog on 21/01/17.
 */

public class LogCat extends AppCompatActivity{
    private static final String TAG = "Personaprog";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v(TAG,"log verdose");
        Log.d(TAG,"log verdose");
        Log.i(TAG,"log verdose");
        Log.e(TAG,"Log erro",new RuntimeException("errro"));
        Log.v(TAG,"log verdose");



    }
}

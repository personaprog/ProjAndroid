package com.example.persprog.programacao.ca4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

/**
 * Created by persprog on 21/01/17.
 */

public class Lifecycle extends AppCompatActivity {
    protected static final String TAG = "Personaprog";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,getClassName()+".onCrete() Chamado: " + savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,getClassName()+".onRestart() Chamado: " );

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG,getClassName()+".onResume() Chamado: " );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,getClassName()+".onPause Chamado: " );
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.i(TAG,getClassName()+".onSaveInstanceState Chamado: " );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,getClassName()+".onStop Chamado: " );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,getClassName()+".onDestroy Chamado: " );
    }

    private String getClassName(){
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home){
            finish();
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}

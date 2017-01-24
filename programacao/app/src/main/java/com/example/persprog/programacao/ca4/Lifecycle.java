package com.example.persprog.programacao.ca4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.ShareActionProvider;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.persprog.programacao.R;
import com.example.persprog.programacao.cap3.Layout;
import com.example.persprog.programacao.cap5.MyTabListener;

/**
 * Created by persprog on 21/01/17.
 */

public class Lifecycle extends AppCompatActivity {
    protected static final String TAG = "Personaprog";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(TAG);
        actionBar.setNavigationMode((ActionBar.NAVIGATION_MODE_TABS));
        actionBar.addTab(actionBar.newTab().setText("Layout").setTabListener(new MyTabListener(this,1)));
        actionBar.addTab(actionBar.newTab().setText("Bundle").setTabListener(new MyTabListener(this,2)));
        actionBar.addTab(actionBar.newTab().setText("Sair").setTabListener(new MyTabListener(this,3)));
    }

    @Override
    protected void onRestart() {
        super.onRestart();

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {



        int id = item.getItemId();
        if (id == R.id.action_layout) {
            Intent layoutpage = new Intent(this, Layout.class);
            startActivity(layoutpage);
            return true;
        } else if (id == R.id.action_bundle) {
            Toast.makeText(this,"Bunble",Toast.LENGTH_SHORT);
            return true;
        } else if (id == R.id.action_out) {
            Toast.makeText(this,"Fechar",Toast.LENGTH_SHORT);
            finish();
            return true;
        }
        if(id == android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}

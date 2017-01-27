package com.example.persprog.programacao.Ac_ActionBar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.R;

/**
 * Created by persprog on 25/01/17.
 */

public class ActMenuMain extends Lifecycle {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menumain);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {



        int id = item.getItemId();

         if (id == R.id.action_bundle) {
            Toast.makeText(this,"Bunble",Toast.LENGTH_SHORT);
            return true;
        } else if (id == R.id.action_out) {
            Toast.makeText(this,"Fechar",Toast.LENGTH_SHORT);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

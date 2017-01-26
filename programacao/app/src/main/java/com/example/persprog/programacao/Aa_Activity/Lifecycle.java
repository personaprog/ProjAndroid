package com.example.persprog.programacao.Aa_Activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by persprog on 21/01/17.
 */

public class Lifecycle extends AppCompatActivity {
    protected static final String TAG = "Personaprog";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



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
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == android.R.id.home){
         /*   AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Activitys");
            builder.setMessage("Fechar Aplicativos?");
            builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {*/
                    finish();

         /*       }
            });
            builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getBaseContext(),"Acrivitty Diponivel",Toast.LENGTH_SHORT).show();

                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();*/
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}

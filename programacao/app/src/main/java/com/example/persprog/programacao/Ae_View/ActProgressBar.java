package com.example.persprog.programacao.Ae_View;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.R;

/**
 * Created by persprog on 26/01/17.
 */

public class ActProgressBar extends Lifecycle {
    private Context context = this;
    private ProgressBar progressBar;

    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);
        progressBar = (ProgressBar) findViewById(R.id.progressAct);
        Button btnpro = (Button) findViewById(R.id.btnprogress);
        btnpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i <= 100; i++) {
                            final int progress = i;
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Log.d(TAG, ">> Progresss: " + progress);
                                    progressBar.setProgress(progress);
                                }
                            });
                            try {
                                Thread.sleep(200);
                                ;
                            } catch (Exception e) {
                            }
                            Toast.makeText(context, "Fim", Toast.LENGTH_SHORT);
                        }

                    }
                });

            }

        });
    }
}
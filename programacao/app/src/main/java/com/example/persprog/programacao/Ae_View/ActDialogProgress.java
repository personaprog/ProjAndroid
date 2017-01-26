package com.example.persprog.programacao.Ae_View;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.R;

import java.io.InputStream;
import java.net.URL;


/**
 * Created by persprog on 26/01/17.
 */

public class ActDialogProgress extends Lifecycle {
    private static  final String url = "http://livroandroid.com.br/imgs/livro_android.png";
    private ProgressDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogprogress);
        dialog = ProgressDialog.show(this, "Exemplo", "Aguarde");
   downloadImagem(url);
   }

    private void downloadImagem(final String urlImg){
        new Thread(){
            @Override
            public void run() {
                try {
                    URL ur = new URL(urlImg);
                    InputStream in = ur.openStream();
                    final Bitmap imagem = BitmapFactory.decodeStream(in);
                    in.close();
                    atualizaImagem(imagem);
                } catch (Exception e) {

                }


            }
        }.start();


        }
    private  void atualizaImagem(final Bitmap imagem){
        runOnUiThread((new Runnable() {
            @Override
            public void run() {
                dialog.dismiss();
                ImageView img = (ImageView) findViewById(R.id.imgdialogpro);
                img.setImageBitmap(imagem);
            }
        }));
    }
    }


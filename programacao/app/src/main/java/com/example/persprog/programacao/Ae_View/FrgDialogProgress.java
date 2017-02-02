package com.example.persprog.programacao.Ae_View;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.R;

import java.io.InputStream;
import java.net.URL;


/**
 * Created by persprog on 26/01/17.
 */

public class FrgDialogProgress extends Fragment {
    private static  final String[] url ={"http://livroandroid.com.br/imgs/livro_android.png",
            "http://pngimg.com/upload/small/arctic_fox_PNG18480.png",
            "http://pngimg.com/upload/small/persimmon_PNG9194.png",
            "http://pngimg.com/upload/small/bush_PNG7212.png"};
    private ProgressDialog dialog;
    private ProgressBar progress;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_dialogprogress,container,false);
       // dialog = ProgressDialog.show(getActivity(), "Exemplo", "Aguarde");
        ImageView img = (ImageView) view.findViewById(R.id.imgdialogpro);
        progress = (ProgressBar) view.findViewById(R.id.progressdia);
        progress.setVisibility( View.VISIBLE );
        downloadImagem( url, view );
        return view;
    }
    private void downloadImagem(final String[] urlImg, final View view){
        new Thread(){
            @Override
            public void run() {
                try {
                    for(int i=0;i<=2;i++) {
                        URL ur = new URL( urlImg[i] );
                        InputStream in = ur.openStream();
                        final Bitmap bitman = BitmapFactory.decodeStream( in );
                        atualizaImagem(bitman,view,i);
                        in.close();
                    }
                    progress.setVisibility( View.INVISIBLE );
                } catch (Exception e){}
            }
        }.start();
    }
    private  void atualizaImagem(final Bitmap imagem, final View view,final int count){
        getActivity().runOnUiThread((new Runnable() {
            @Override
            public void run() {
                ImageView imageView =  new ImageView(getActivity());
                imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                imageView.setId(count);
                imageView.setImageBitmap(imagem);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.dioaloglinear);
                linearLayout.addView( imageView );
            }
        }));
    }
}
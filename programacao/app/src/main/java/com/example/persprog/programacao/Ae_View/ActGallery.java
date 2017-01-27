package com.example.persprog.programacao.Ae_View;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.Af_adapter.ImagemAdapter;
import com.example.persprog.programacao.R;

/**
 * Created by persprog on 26/01/17.
 */

@SuppressWarnings("deprecation")
public class ActGallery extends Lifecycle {
    // Planetas
    private int[] imagens = {
            R.drawable.cow1g,
            R.drawable.cow2g,
            R.drawable.cow3g,
            R.drawable.cow4g,
            R.drawable.cow5g,
            R.drawable.cow6g,
            R.drawable.cow7g
    };

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);


        setContentView(R.layout.activity_gallery);
        Gallery g = (Gallery) findViewById(R.id.imgsgalery);
        g.setAdapter(new ImagemAdapter(this, imagens));
        g.setOnItemClickListener(onGalleryItemClick(this));
    }

    private AdapterView.OnItemClickListener onGalleryItemClick(final Context context) {
        return new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int posicao, long id) {
                // Exemplo de alerta com Toast com uma view dentro
                // Geralmente o Toast é apenas um texto
                ImageView imgView = new ImageView(context);
                imgView.setImageResource(imagens[posicao]);
                Toast t = new Toast(context);
                t.setView(imgView);
                t.show();
            }
        };
    }

}

package com.example.persprog.programacao.Ae_View;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.Af_adapter.ImagemAdapter;
import com.example.persprog.programacao.R;

/**
 * Created by persprog on 26/01/17.
 */

public class ActGridView extends Lifecycle {

    // Array com os ids das imagens
    private int[] imagens = {
            R.drawable.cow1,
            R.drawable.cow2,
            R.drawable.cow3,
            R.drawable.cow4,
            R.drawable.cow5,
            R.drawable.cow6,
            R.drawable.cow7,
    };

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        setContentView(R.layout.activity_gridview);
        GridView grid = (GridView) findViewById(R.id.gridview1);
        grid.setOnItemClickListener(onGridViewItemClick());
        // Informar o adapter para preencher o GridView
        grid.setAdapter(new ImagemAdapter(this, imagens));
    }

    // Evento ao clicar no item do grid
    private AdapterView.OnItemClickListener onGridViewItemClick() {
        return new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int posicao, long id) {
                Toast.makeText(ActGridView.this, "Imagem selecionada: " +
                        posicao, Toast.LENGTH_SHORT).show();
            }
        };
    }
}

package com.example.persprog.programacao.Ae_View;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.Af_adapter.ImagemAdapter;
import com.example.persprog.programacao.R;

import static com.example.persprog.programacao.R.layout.listaexemplo_fragment;

/**
 * Created by persprog on 26/01/17.
 */

public class FrgGridView extends Fragment {

    // Array com os ids das imagens
    private int[] imagens = {
            R.drawable.cow1,
            R.drawable.cow2,
            R.drawable.cow3,
            R.drawable.cow4,
            R.drawable.cow5,
            R.drawable.cow6,
            R.drawable.cow7,
            R.drawable.cow1,
            R.drawable.cow2,
            R.drawable.cow3,
            R.drawable.cow4,
            R.drawable.cow5,
            R.drawable.cow6,
            R.drawable.cow7,
            R.drawable.cow1,
            R.drawable.cow2,
            R.drawable.cow3,
            R.drawable.cow4,
            R.drawable.cow5,
            R.drawable.cow6,
            R.drawable.cow7,
            R.drawable.cow1,
            R.drawable.cow2,
            R.drawable.cow3,
            R.drawable.cow4,
            R.drawable.cow5,
            R.drawable.cow6,
            R.drawable.cow7,
            R.drawable.cow1,
            R.drawable.cow2,
            R.drawable.cow3,
            R.drawable.cow4,
            R.drawable.cow5,
            R.drawable.cow6,
            R.drawable.cow7,
            R.drawable.cow1,
            R.drawable.cow2,
            R.drawable.cow3,
            R.drawable.cow4,
            R.drawable.cow5,
            R.drawable.cow6,
            R.drawable.cow7,
            R.drawable.cow1,
            R.drawable.cow2,
            R.drawable.cow3,
            R.drawable.cow4,
            R.drawable.cow5,
            R.drawable.cow6,
            R.drawable.cow7,
    };


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_gridview,container,false);
        GridView grid = (GridView) view.findViewById(R.id.gridview1);
        grid.setOnItemClickListener(onGridViewItemClick());
        // Informar o adapter para preencher o GridView
        grid.setAdapter(new ImagemAdapter(getActivity(), imagens));
        return view;
    }



    // Evento ao clicar no item do grid
    private AdapterView.OnItemClickListener onGridViewItemClick() {
        return new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int posicao, long id) {
                Toast.makeText(getActivity(), "Imagem selecionada: " +
                        posicao, Toast.LENGTH_SHORT).show();
            }
        };
    }


}

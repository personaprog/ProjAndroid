package com.example.persprog.programacao.Af_adapter;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.AdapterView;
import com.example.persprog.programacao.Ae_View.FrgDialogProgress;
import com.example.persprog.programacao.Ae_View.FrgGallery;
import com.example.persprog.programacao.Ae_View.FrgGridView;
import com.example.persprog.programacao.Ae_View.FrgListViewCustom;
import com.example.persprog.programacao.Ae_View.FrgSpinner;
import com.example.persprog.programacao.Ae_View.Frgtextview;
import com.example.persprog.programacao.Ag_Fragment.ListaExemploFragment;
import com.example.persprog.programacao.R;
/**
 * Created by persprog on 26/01/17.
 */
public class Exemplos {
    private final   String[]  items = new String[]{
            "GridLayout",
            "Spinner",
            "Formulário",
            "Dialog Progress",
            "ListviewCustom",
            "Galeria"
    };
    private final   Fragment[]  frg = new Fragment[]{
            new FrgGridView(),
            new FrgSpinner(),
            new Frgtextview(),
            new FrgDialogProgress(),
            new FrgListViewCustom(),
            new FrgGallery()
    };
    public String[] getItems() {return items;}
    private Fragment[] getFrg() {return frg;    }
    public AdapterView.OnItemClickListener Onclick(final Fragment frag){return OnItemClickExemplo(frag);}
    private final AdapterView.OnItemClickListener OnItemClickExemplo(final Fragment frag){
        return new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentTransaction fragmentTransaction =  frag.getFragmentManager().beginTransaction();

                fragmentTransaction.replace( R.id.exemplo, getFrg()[position] );
                    fragmentTransaction.commit();
            }
        };
    };
}
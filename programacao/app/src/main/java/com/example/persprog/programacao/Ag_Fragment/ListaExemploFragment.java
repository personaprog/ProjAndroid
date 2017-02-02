package com.example.persprog.programacao.Ag_Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.persprog.programacao.Ab_Basico.ActBundle;
import com.example.persprog.programacao.Ac_ActionBar.ActMenuMain;
import com.example.persprog.programacao.Ac_ActionBar.ActTabListener;
import com.example.persprog.programacao.Ad_Layout.ActFrameLayout;
import com.example.persprog.programacao.Ad_Layout.ActGridLayout;
import com.example.persprog.programacao.Ad_Layout.ActLinearLayout;
import com.example.persprog.programacao.Ad_Layout.ActRelativeLayout;

import com.example.persprog.programacao.Ae_View.FrgDialogProgress;
import com.example.persprog.programacao.Ae_View.FrgGridView;
import com.example.persprog.programacao.Ae_View.FrgListViewCustom;
import com.example.persprog.programacao.Ae_View.FrgSpinner;
import com.example.persprog.programacao.Ae_View.Frgtextview;
import com.example.persprog.programacao.Af_adapter.Exemplos;
import com.example.persprog.programacao.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.persprog.programacao.R.layout.listaexemplo_fragment;

/**
 * Created by persprog on 31/01/17.
 */

public class ListaExemploFragment  extends Fragment {
    private Exemplos items = new Exemplos();
    private ListviewFragment lista = new ListviewFragment();
    private ListView list;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(listaexemplo_fragment,container,false);
        lista.ListVi( view,getActivity(),items.getItems(),items.Onclick(this));
        return view;
    }
}

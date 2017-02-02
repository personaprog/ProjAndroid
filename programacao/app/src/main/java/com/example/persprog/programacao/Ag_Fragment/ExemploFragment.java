package com.example.persprog.programacao.Ag_Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.persprog.programacao.R.layout.exemplo_fragment;

/**
 * Created by persprog on 31/01/17.
 */

public class ExemploFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(exemplo_fragment,container,false);
        return view;

    }
}

package com.example.persprog.programacao.Ag_Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.persprog.programacao.R;


public class ViewPager1 extends android.support.v4.app.Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view1, container, false);
        return view;
    }
}

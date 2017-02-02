package com.example.persprog.programacao.Ae_View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.persprog.programacao.R;
import com.example.persprog.programacao.Aa_Activity.Lifecycle;

/**
 * Created by persprog on 24/01/17.
 */

public class Frgtextview extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_textview,container,false);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.txlinear);
                TextView textView = new TextView(view.getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setText("testando");
        textView.setTextSize(40);
        linearLayout.addView(textView);


        return view;
    }


}

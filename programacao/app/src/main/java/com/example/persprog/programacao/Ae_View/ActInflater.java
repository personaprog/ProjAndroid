package com.example.persprog.programacao.Ae_View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.R;

/**
 * Created by persprog on 26/01/17.
 */

public class ActInflater extends Lifecycle {
    @Override
    protected void onCreate(@Nullable Bundle  savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inflater);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.LinearInflate);
        final TextView layout = (TextView) findViewById(R.id.edit_inflate);
        TextView view = (TextView) LayoutInflater.from(this).inflate(R.layout.inflate_textview,linearLayout,false);
        view.setText("Inflou TexView");
        linearLayout.addView(view);

    }
}

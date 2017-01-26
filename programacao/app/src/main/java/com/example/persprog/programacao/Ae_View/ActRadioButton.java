package com.example.persprog.programacao.Ae_View;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.persprog.programacao.R;
import com.example.persprog.programacao.Aa_Activity.Lifecycle;

/**
 * Created by persprog on 25/01/17.
 */

public class ActRadioButton extends Lifecycle
{
final Context context = this;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton);
        final RadioGroup rgroup = (RadioGroup) findViewById(R.id.rgroup1);
        rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                boolean sim = R.id.rgroupsim == checkedId;
                boolean nao = R.id.rgroupnao == checkedId;
                if(sim)
                    Toast.makeText(context, "Marcou sim:" + checkedId , Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(context, "Marcou Não:" + checkedId , Toast.LENGTH_SHORT).show();
            }
        });
    }
}

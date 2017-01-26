package com.example.persprog.programacao.Ae_View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.persprog.programacao.R;
import com.example.persprog.programacao.Aa_Activity.Lifecycle;

/**
 * Created by persprog on 24/01/17.
 */

public class ActAutoComplete extends Lifecycle {

    private static final String[] ESTADOS = new String[]{"Acre", "Alagoas", "Amapá", "Amazonas",
            "Bahia", "Ceará", "Distrito Federal", "Goiás", "Espírito Santo", "Maranhão", "Mato Grosso",
            "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí",
            "Rio de Janeiro", "Rio Grandedo Norte", "Rio Grande do Sul", "Rondônia", "Roraima",
            "São Paulo", "Santa Catarina", "Sergipe", "Tocantins"
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autocomplete);
        AutoCompleteTextView textedit = (AutoCompleteTextView) findViewById(R.id.editautocomp);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,ESTADOS);
        textedit.setAdapter(adapter);

    }
}

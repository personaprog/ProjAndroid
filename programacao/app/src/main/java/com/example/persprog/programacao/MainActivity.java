package com.example.persprog.programacao;



import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;

import android.widget.ArrayAdapter;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.Ab_Basico.ActBundle;
import com.example.persprog.programacao.Ac_ActionBar.ActMenuMain;
import com.example.persprog.programacao.Ac_ActionBar.ActTabListener;
import com.example.persprog.programacao.Ad_Layout.ActFrameLayout;
import com.example.persprog.programacao.Ad_Layout.ActGridLayout;
import com.example.persprog.programacao.Ad_Layout.ActLinearLayout;
import com.example.persprog.programacao.Ad_Layout.ActRelativeLayout;
import com.example.persprog.programacao.Ad_Layout.ActScrollView;
import com.example.persprog.programacao.Ad_Layout.ActTabelLayout1;
import com.example.persprog.programacao.Ad_Layout.ActTableLayout;
import com.example.persprog.programacao.Ae_View.ActAutoComplete;
import com.example.persprog.programacao.Ae_View.ActButton;
import com.example.persprog.programacao.Ae_View.ActCheckBoxToggleButton;
import com.example.persprog.programacao.Ae_View.ActDialogProgress;
import com.example.persprog.programacao.Ae_View.ActGallery;
import com.example.persprog.programacao.Ae_View.ActGridView;
import com.example.persprog.programacao.Ae_View.ActInflater;
import com.example.persprog.programacao.Ae_View.ActListView;
import com.example.persprog.programacao.Ae_View.ActListViewCustom;
import com.example.persprog.programacao.Ae_View.ActProgressBar;
import com.example.persprog.programacao.Ae_View.ActRadioButton;
import com.example.persprog.programacao.Ae_View.ActSpinner;
import com.example.persprog.programacao.Ae_View.Acttextview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Lifecycle {

    private final Context context = this;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = (ListView) findViewById(R.id.listActivity);

        final String[] items = new String[]{
                "MenuMain",
                "TabListner",
                "Bundle",
                "FrameLayout",
                "LinearLayout",
                "TableLayout shrinkColumns",
                "TableLayout strechColumns",
                "GridLayout",
                "RelativeLayout",
                "ScrollView",
                "textView",
                "AutoComplete",
                "Button / Button Image",
                "CheckBox / ToggleButton",
                "RadioButton",
                "Spinner",
                "DialogProgress",
                "ProgressBar",
                "Inflater",
                "ListView",
                "ListViewCustom",
                "GridView",
                "Galeria de Fotos",
                "Sair"
        };

        List<String> listAct = Arrays.asList(items);

        list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, items));

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                try {
                    switch (position) {

                        case 0:
                            startActivity(new Intent(context, ActMenuMain.class));
                            break;
                        case 1:
                            startActivity(new Intent(context, ActTabListener.class));
                            break;
                        case 2:
                            startActivity(new Intent(context, ActBundle.class));
                            break;
                        case 3:
                            startActivity(new Intent(context, ActFrameLayout.class));
                            break;
                        case 4:
                            startActivity(new Intent(context, ActLinearLayout.class));
                            break;
                        case 5:
                            startActivity(new Intent(context, ActTableLayout.class));
                            break;
                        case 6:
                            startActivity(new Intent(context, ActTabelLayout1.class));
                            break;
                        case 7:
                            startActivity(new Intent(context, ActGridLayout.class));
                            break;
                        case 8:
                            startActivity(new Intent(context, ActRelativeLayout.class));
                            break;
                        case 9:
                            startActivity(new Intent(context, ActScrollView.class));
                            break;
                        case 10:
                            startActivity(new Intent(context, Acttextview.class));
                        case 11:
                            startActivity(new Intent(context, ActAutoComplete.class));
                            break;
                        case 12:
                            startActivity(new Intent(context, ActButton.class));
                            break;
                        case 13:
                            startActivity(new Intent(context, ActCheckBoxToggleButton.class));
                            break;
                        case 14:
                            startActivity(new Intent(context, ActRadioButton.class));
                            break;
                        case 15:
                            startActivity(new Intent(context, ActSpinner.class));
                            break;
                        case 16:
                            startActivity(new Intent(context, ActDialogProgress.class));
                            break;

                        case 17:
                            startActivity(new Intent(context, ActProgressBar.class));
                            break;
                        case 18:
                            startActivity(new Intent(context, ActInflater.class));
                            break;
                        case 19:
                            startActivity(new Intent(context, ActListView.class));
                            break;
                        case 20:
                            startActivity(new Intent(context, ActListViewCustom.class));
                            break;
                        case 21:
                            startActivity(new Intent(context, ActGridView.class));
                            break;
                        case 22:
                            startActivity(new Intent(context, ActGallery.class));
                            break;
                        case 23:
                            finish();
                            break;
                        default:
                            finish();
                            break;
                    }
                } catch (Exception e) {
                    Toast.makeText(context, "Erro :" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
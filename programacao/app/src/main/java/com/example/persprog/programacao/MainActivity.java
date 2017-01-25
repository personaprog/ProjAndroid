package com.example.persprog.programacao;



import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;
import android.widget.Toast;
import android.view.View;

import android.widget.ArrayAdapter;
import com.example.persprog.programacao.ca4.Bundle_Exemp;
import com.example.persprog.programacao.cap6.ActFrameLayout;
import com.example.persprog.programacao.cap6.ActGridLayout;
import com.example.persprog.programacao.cap6.ActLinearLayout;
import com.example.persprog.programacao.cap6.ActRelativeLayout;
import com.example.persprog.programacao.cap6.ActScrollView;
import com.example.persprog.programacao.cap6.ActTabelLayout1;
import com.example.persprog.programacao.cap6.ActTableLayout;
import com.example.persprog.programacao.cap7.ActAutoComplete;
import com.example.persprog.programacao.cap7.Acttextview;

public class MainActivity extends ListActivity {

    private  final Context context = this;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final  String[] items = new String[] {"Bundle","FrameLayout","LinearLayout","TableLayout shrinkColumns","TableLayout strechColumns","GridLayout","RelativeLayout","ScrollView","textView","AutoComplete", "Sair"};
        this.setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, items));
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        try {
            switch (position) {
                case 0:
                    Intent itbundle = new Intent(this, Bundle_Exemp.class);
                    Bundle params = new Bundle();
                    params.putString("nome", "Personaprog");
                    itbundle.putExtras(params);
                    startActivity(itbundle);
                    break;
                case 1:
                    startActivity(new Intent(this,ActFrameLayout.class));
                    break;
                case 2:
                    startActivity(new Intent(this,ActLinearLayout.class));
                    break;
                case 3:
                    startActivity(new Intent(this,ActTableLayout.class));
                    break;
                case 4:
                    startActivity(new Intent(this,ActTabelLayout1.class));
                    break;
                case 5:
                    startActivity(new Intent(this,ActGridLayout.class));
                    break;
                case 6:
                    startActivity(new Intent(this,ActRelativeLayout.class));
                    break;
                case 7:
                    startActivity(new Intent(this,ActScrollView.class));
                    break;
                case 8:
                    startActivity(new Intent(this, Acttextview.class));
                case 9:
                    startActivity(new Intent(this, ActAutoComplete.class));
                    break;
                case 10:
                   finish();
                    break;
                default:
                    finish();
                    break;
            }
        } catch (Exception e) {
            Toast.makeText(this, "Erro :" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }


}
package com.example.persprog.programacao.Ae_View;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.persprog.programacao.Aa_Activity.Lifecycle;
import com.example.persprog.programacao.Af_adapter.ImagemAdapter;
import com.example.persprog.programacao.R;

/**
 * Created by persprog on 26/01/17.
 */

@SuppressWarnings("deprecation")
public class FrgGallery extends Fragment {
    // Planetas
    private int[] imagens = {
            R.drawable.cow1,
            R.drawable.cow2,
            R.drawable.cow3,
            R.drawable.cow4,
            R.drawable.cow5,
            R.drawable.cow6,
            R.drawable.cow7
    };

    private Handler handles = new TesteHadler();
    protected  static  final int MESSAGE = 1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_gallery,container,false);

        Gallery g = (Gallery) view.findViewById(R.id.imgsgalery);
        g.setAdapter(new ImagemAdapter(getActivity(), imagens));
        g.setOnItemClickListener(onGalleryItemClick(getActivity()));
        Message msw = new Message();
        msw.what = MESSAGE;
        handles.sendMessageDelayed( msw ,40000 );
        return view;
    }

private  class TesteHadler extends Handler{
    @Override
    public void handleMessage(Message msg) {
        switch (msg.what){
            case MESSAGE:
                Toast.makeText(getActivity().getBaseContext(),"A mensagem Chegou",Toast.LENGTH_SHORT ).show();
                break;
        }
    }
}

    private AdapterView.OnItemClickListener onGalleryItemClick(final Context context) {
        return new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int posicao, long id) {
                // Exemplo de alerta com Toast com uma view dentro
                // Geralmente o Toast é apenas um texto
                ImageView imgView = new ImageView(context);
                imgView.setImageResource(imagens[posicao]);
                Toast t = new Toast(context);
                t.setView(imgView);
                t.show();
            }
        };
    }

}

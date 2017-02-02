package com.example.persprog.programacao.Af_adapter;

import com.example.persprog.programacao.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by persprog on 26/01/17.
 */

public class Vacas {

    public String nome;
    public int foto;
    public int count;

    public Vacas(String nome, int foto) {
        this.nome = nome;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static List<Vacas> getVacas(){
        List<Vacas> vacas = new ArrayList<Vacas>();
        vacas.add(new Vacas("Vaca1", R.drawable.cow1));
        vacas.add(new Vacas("Vaca2", R.drawable.cow2));
        vacas.add(new Vacas("Vaca3", R.drawable.cow3));
        vacas.add(new Vacas("Vaca4", R.drawable.cow4));
        vacas.add(new Vacas("Vaca5", R.drawable.cow1));
        vacas.add(new Vacas("Vaca6", R.drawable.cow2));
        vacas.add(new Vacas("Vaca7", R.drawable.cow3));
        vacas.add(new Vacas("Vaca8", R.drawable.cow4));
        vacas.add(new Vacas("Vaca9", R.drawable.cow1));
        vacas.add(new Vacas("Vaca10", R.drawable.cow2));
        vacas.add(new Vacas("Vaca11", R.drawable.cow3));
        vacas.add(new Vacas("Vaca12", R.drawable.cow4));
        return vacas;
    }
}

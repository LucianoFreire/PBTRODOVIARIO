package com.example.patipan.traininglistview;

import java.util.ArrayList;
import java.util.List;


public class Veiculos {
    private int resId;
    private String modelo;
    private String descricao;

    List<Veiculos> veic = new ArrayList<>();

    Veiculos() {

    }

    Veiculos(int resId, String modelo, String descricao) {
        this.resId = resId;
        this.modelo = modelo;
        this.descricao = descricao;
    }

    Veiculos(int resId, String modelo) {
        this.resId = resId;
        this.modelo = modelo;

    }


    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Veiculos> getVeic() {
        return veic;
    }

    public void setVeic(List<Veiculos> veic) {
        this.veic = veic;
    }
}

package com.example.apsi;

import java.io.Serializable;

public class Fruta implements Serializable {
    private String nomeFruta;
    private String precoFruta;
    private String mesColheita;

    public String getNomeFruta() {
        return nomeFruta;
    }

    public void setNomeFruta(String nomeFruta) {
        this.nomeFruta = nomeFruta;
    }

    public String getPrecoFruta() {
        return precoFruta;
    }

    public void setPrecoFruta(String precoFruta) {
        this.precoFruta = precoFruta;
    }

    public String getMesColheita() {
        return mesColheita;
    }

    public void setMesColheita(String mesColheita) {
        this.mesColheita = mesColheita;
    }

    @Override
    public String toString() {
        return "Fruta: "+ nomeFruta +
                "\nPreço: " + precoFruta +
                "\nMês Colheita: " + mesColheita;
    }
}

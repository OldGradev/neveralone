package com.example.utente.neveralone;

/**
 * Created by Utente on 27/01/2017.
 */
public class Disagio {

    private String specifiche;
    private String posizione,disagio,disagiato;

    public Disagio(String specifiche, String posizione, String disagio, String disagiato) {
        this.specifiche = specifiche;
        this.posizione = posizione;
        this.disagio = disagio;
        this.disagiato = disagiato;
    }


    public String getDisagiato() {
        return disagiato;
    }

    public void setDisagiato(String disagiato) {
        this.disagiato = disagiato;
    }

    public String getDisagio() {
        return disagio;
    }

    public void setDisagio(String disagio) {
        this.disagio = disagio;
    }

    public String getPosizione() {
        return posizione;
    }

    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }

    public String getSpecifiche() {
        return specifiche;
    }

    public void setSpecifiche(String specifiche) {
        this.specifiche = specifiche;
    }
}

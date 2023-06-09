package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name = "enfermedad_bebes")
public class Enfermedad_bebe {
    private TipoEnfermedad tipoEnfermedad;
    private Bebe bebe;
    private String sintonmas;
    public Enfermedad_bebe(TipoEnfermedad tipoEnfermedad, Bebe bebe, String sintonmas) {
        this.tipoEnfermedad = tipoEnfermedad;
        this.bebe = bebe;
        this.sintonmas = sintonmas;
    }
    public Enfermedad_bebe() {
    }
    public TipoEnfermedad getTipoEnfermedad() {
        return tipoEnfermedad;
    }

    public void setTipoEnfermedad(TipoEnfermedad tipoEnfermedad) {
        this.tipoEnfermedad = tipoEnfermedad;
    }

    public Bebe getBebe() {
        return bebe;
    }

    public void setBebe(Bebe bebe) {
        this.bebe = bebe;
    }

    public String getSintonmas() {
        return sintonmas;
    }

    public void setSintonmas(String sintonmas) {
        this.sintonmas = sintonmas;
    }

}
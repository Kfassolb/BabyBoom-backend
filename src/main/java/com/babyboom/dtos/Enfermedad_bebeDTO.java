package com.babyboom.dtos;

import com.babyboom.entities.Bebe;
import com.babyboom.entities.TipoEnfermedad;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Enfermedad_bebeDTO {
    private Long id;
    private TipoEnfermedad tipoEnfermedad;
    private Bebe bebe;
    private String sintonmas;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

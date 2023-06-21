package com.babyboom.dtos;

import com.babyboom.entities.Bebe;
import com.babyboom.entities.TipoEnfermedad;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Enfermedad_bebeDTO {
    private int idEnfermedadBebe;

    private TipoEnfermedad tipoEnfermedad;

    private Bebe bebe;
    private String sintomas;

    public int getIdEnfermedadBebe() {
        return idEnfermedadBebe;
    }

    public void setIdEnfermedadBebe(int idEnfermedadBebe) {
        this.idEnfermedadBebe = idEnfermedadBebe;
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

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
}

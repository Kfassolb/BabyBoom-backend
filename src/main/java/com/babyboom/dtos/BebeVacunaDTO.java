package com.babyboom.dtos;

import com.babyboom.entities.Bebe;
import com.babyboom.entities.ControlVacunacion;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class BebeVacunaDTO {

    private int idBebeVacuna;

    private Bebe bebe;

    private ControlVacunacion controlVacunacion;

    public int getIdBebeVacuna() {
        return idBebeVacuna;
    }

    public void setIdBebeVacuna(int idBebeVacuna) {
        this.idBebeVacuna = idBebeVacuna;
    }

    public Bebe getBebe() {
        return bebe;
    }

    public void setBebe(Bebe bebe) {
        this.bebe = bebe;
    }

    public ControlVacunacion getControlVacunacion() {
        return controlVacunacion;
    }

    public void setControlVacunacion(ControlVacunacion controlVacunacion) {
        this.controlVacunacion = controlVacunacion;
    }
}

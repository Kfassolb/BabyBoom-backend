package com.babyboom.dtos;

import com.babyboom.entities.Bebe;
import com.babyboom.entities.ControlVacunacion;

public class BebeVacunaDTO {
    private Bebe bebe;
    private ControlVacunacion controlVacunacion;
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

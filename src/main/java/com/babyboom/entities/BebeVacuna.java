package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name = "bebevacunas")
public class BebeVacuna {
    @Id
    @ManyToOne
    @JoinColumn(name = "idBebe",nullable = false)
    private Bebe bebe;
    @ManyToOne
    @JoinColumn(name = "idControlVacunacion",nullable = false)
    private ControlVacunacion controlVacunacion;
    public BebeVacuna() {
    }
    public BebeVacuna(Bebe bebe, ControlVacunacion controlVacunacion) {
        this.bebe = bebe;
        this.controlVacunacion = controlVacunacion;
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

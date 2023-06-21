package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name = "bebevacunas")
public class BebeVacuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBebeVacuna;
    @ManyToOne
    @JoinColumn(name = "idBebe",nullable = false)
    private Bebe bebe;
    @ManyToOne
    @JoinColumn(name = "idControlVacunacion",nullable = false)
    private ControlVacunacion controlVacunacion;

    public BebeVacuna(int idBebeVacuna, Bebe bebe, ControlVacunacion controlVacunacion) {
        this.idBebeVacuna = idBebeVacuna;
        this.bebe = bebe;
        this.controlVacunacion = controlVacunacion;
    }

    public BebeVacuna() {
    }

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

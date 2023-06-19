package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name = "bebevacunas")
public class BebeVacuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "idBebe",nullable = false)
    private Bebe bebe;
    @ManyToOne
    @JoinColumn(name = "idControlVacunacion",nullable = false)
    private ControlVacunacion controlVacunacion;

    public BebeVacuna(int id, Bebe bebe, ControlVacunacion controlVacunacion) {
        this.id = id;
        this.bebe = bebe;
        this.controlVacunacion = controlVacunacion;
    }

    public BebeVacuna() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name = "guarderiaservicios")
public class GuarderiaServicio {
    @Id
    @ManyToOne
    @JoinColumn(name = "idServicio")
    private Servicio servicio;
    @ManyToOne
    @JoinColumn(name = "idGuarderia")
    private Guarderia guarderia;
    public GuarderiaServicio() {
    }

    public GuarderiaServicio(Servicio servicio, Guarderia guarderia) {
        this.servicio = servicio;
        this.guarderia = guarderia;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Guarderia getGuarderia() {
        return guarderia;
    }

    public void setGuarderia(Guarderia guarderia) {
        this.guarderia = guarderia;
    }
}

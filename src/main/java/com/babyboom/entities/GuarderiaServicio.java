package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name = "guarderiaservicios")
public class GuarderiaServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGuarderiaServicio;

    @ManyToOne
    @JoinColumn(name="idGuarderia")
    private Guarderia guarderia;

    @ManyToOne
    @JoinColumn(name="idServicio")
    private Servicio servicio;

    public GuarderiaServicio() {
    }

    public GuarderiaServicio(int idGuarderiaServicio, Guarderia guarderia, Servicio servicio) {
        this.idGuarderiaServicio = idGuarderiaServicio;
        this.guarderia = guarderia;
        this.servicio = servicio;
    }

    public int getIdGuarderiaServicio() {
        return idGuarderiaServicio;
    }

    public void setIdGuarderiaServicio(int idGuarderiaServicio) {
        this.idGuarderiaServicio = idGuarderiaServicio;
    }

    public Guarderia getGuarderia() {
        return guarderia;
    }

    public void setGuarderia(Guarderia guarderia) {
        this.guarderia = guarderia;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}

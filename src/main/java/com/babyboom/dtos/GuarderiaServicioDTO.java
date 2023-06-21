package com.babyboom.dtos;

import com.babyboom.entities.Guarderia;
import com.babyboom.entities.Servicio;

public class GuarderiaServicioDTO {
    private int idGuarderiaServicio;

    private Guarderia guarderia;

    private Servicio servicio;

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

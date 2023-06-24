package com.babyboom.dtos;

import com.babyboom.entities.Servicio;

public class GuarderiaServicioDTO {
    private int idGuarderiaServicio;
    private Servicio servicio;
    private Guarderia guarderia;
    public int getIdGuarderiaServicio() {
        return idGuarderiaServicio;
    }

    public void setIdGuarderiaServicio(int idGuarderiaServicio)
    {
        this.idGuarderiaServicio = idGuarderiaServicio;
    public Servicio getServicio()
    {
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

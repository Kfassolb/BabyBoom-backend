package com.babyboom.dtos;

import java.time.LocalDate;

public class ComunidadDTO {
    private  int idComunidad;
    private String nameComunidad;
    private String Contenido;
    private LocalDate FechaInicio;

    public int getIdComunidad() {
        return idComunidad;
    }

    public void setIdComunidad(int idComunidad) {
        this.idComunidad = idComunidad;
    }

    public String getNameComunidad() {
        return nameComunidad;
    }

    public void setNameComunidad(String nameComunidad) {
        this.nameComunidad = nameComunidad;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        Contenido = contenido;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }
}

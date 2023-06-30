package com.babyboom.dtos;

import com.babyboom.entities.Apoderado;
import com.babyboom.entities.Soportetecnico;

import java.time.LocalDate;

public class ProblemaDTO {

    private int idProblema;
    private Soportetecnico soportetecnico;
    private Apoderado apoderado;
    private String Titulo;
    private String Descripcion;
    private LocalDate FechaInicio;
    private LocalDate FechaFin;

    public int getIdProblema() {
        return idProblema;
    }

    public void setIdProblema(int idProblema) {
        this.idProblema = idProblema;
    }

    public Soportetecnico getSoportetecnico() {
        return soportetecnico;
    }

    public void setSoportetecnico(Soportetecnico soportetecnico) {
        this.soportetecnico = soportetecnico;
    }

    public Apoderado getApoderado() {
        return apoderado;
    }

    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        FechaFin = fechaFin;
    }
}



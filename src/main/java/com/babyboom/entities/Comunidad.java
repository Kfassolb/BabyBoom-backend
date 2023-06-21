package com.babyboom.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="comunidades")
public class Comunidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idComunidad;
    @Column(name = "nameComunidad", length =40, nullable = false)
    private String nameComunidad;
    @Column(name = "Contenido", length =40, nullable = false)
    private String Contenido;
    @Column(name = "FechaInicio", nullable = false)
    private LocalDate FechaInicio;

    public Comunidad(int idComunidad, String nameComunidad, String contenido, LocalDate fechaInicio) {
        this.idComunidad = idComunidad;
        this.nameComunidad = nameComunidad;
        this.Contenido = contenido;
        this.FechaInicio = fechaInicio;
    }

    public Comunidad() {

    }

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

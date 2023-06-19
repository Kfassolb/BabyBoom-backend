package com.babyboom.entities;


import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "problema")
public class Problema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProblema;

    @ManyToOne
    @JoinColumn(name = "idSoporte", nullable = false)
    private Soportetecnico soportetecnico;

    @ManyToOne
    @JoinColumn(name = "idApoderado", nullable = false)
    private Apoderado apoderado;

    @Column(name="Titulo", length = 35,nullable = false)
    private String Titulo;

    @Column(name="Descripcion", length = 12,nullable = false)
    private String Descripcion;

    @Column(name="FechaInicio", nullable = false)
    private LocalDate FechaInicio;

    @Column(name="FechaFin", nullable = false)
    private LocalDate FechaFin;

    public Problema(){
    }

    public Problema(int idProblema, Soportetecnico soportetecnico, Apoderado apoderado, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idProblema = idProblema;
        this.soportetecnico = soportetecnico;
        this.apoderado = apoderado;
        Titulo = titulo;
        Descripcion = descripcion;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
    }

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
package com.babyboom.entities;


import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "problema")
public class Problema {

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

    public Problema(Soportetecnico soportetecnico, Apoderado apoderado, String Titulo,
                    String Descripcion, LocalDate FechaInicio, LocalDate FechaFin) {

        this.soportetecnico = soportetecnico;
        this.apoderado = apoderado;
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
    }


    public Soportetecnico getSoportetecnico() {return soportetecnico;}

    public void setSoportetecnico (Soportetecnico soportetecnico) {this. soportetecnico = soportetecnico;}


    public Apoderado getApoderado() {return apoderado;}

    public void setApoderado (Apoderado apoderado) {this. apoderado = apoderado;}


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }


    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }


    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.FechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.FechaFin = fechaFin;
    }
}
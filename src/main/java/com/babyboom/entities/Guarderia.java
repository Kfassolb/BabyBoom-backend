package com.babyboom.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Guarderia")
public class Guarderia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGuarderia;
    @Column(name = "proceso", length = 50, nullable = false)
    private String proceso;
    @Column(name = "lugar",length = 60, nullable = false)
    private String lugar;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @Column(name= "nombreGuarderia", length = 60, nullable = false)
    private String nombreGuarderia;

    public Guarderia() {
    }

    public Guarderia(int idGuarderia, String proceso, String lugar, LocalDate fecha, String nombreGuarderia) {
        this.idGuarderia = idGuarderia;
        this.proceso = proceso;
        this.lugar = lugar;
        this.fecha = fecha;
        this.nombreGuarderia = nombreGuarderia;
    }

    public int getIdGuarderia() {
        return idGuarderia;
    }

    public void setIdGuarderia(int idGuarderia) {
        this.idGuarderia = idGuarderia;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombreGuarderia() {
        return nombreGuarderia;
    }

    public void setNombreGuarderia(String nombreGuarderia) {
        this.nombreGuarderia = nombreGuarderia;
    }
}
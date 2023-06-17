package com.babyboom.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="guarderias")
public class Guarderia {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idGuarderia;
@Column(name = "Proceso", length = 50, nullable = false)
private String Proceso;
@Column(name = "Lugar",length = 60, nullable = false)
private String Lugar;
@Column(name = "fecha", nullable = false)
private LocalDate fecha;
@Column(name= "NombreGuarderia", length = 60, nullable = false)
private String NombreGuarderia;

    public Guarderia(int idGuarderia, String proceso, String lugar, LocalDate fecha, String nombreGuarderia) {
        this.idGuarderia = idGuarderia;
        Proceso = proceso;
        Lugar = lugar;
        this.fecha = fecha;
        NombreGuarderia = nombreGuarderia;
    }

    public Guarderia() {
    }

    public int getIdGuarderia() {
        return idGuarderia;
    }

    public void setIdGuarderia(int idGuarderia) {
        this.idGuarderia = idGuarderia;
    }

    public String getProceso() {
        return Proceso;
    }

    public void setProceso(String proceso) {
        Proceso = proceso;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombreGuarderia() {
        return NombreGuarderia;
    }

    public void setNombreGuarderia(String nombreGuarderia) {
        NombreGuarderia = nombreGuarderia;
    }
}

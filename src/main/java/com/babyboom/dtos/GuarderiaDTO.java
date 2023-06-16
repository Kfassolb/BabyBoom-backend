package com.babyboom.dtos;


import java.time.LocalDate;

public class GuarderiaDTO {
    private int idGuarderia;

    private String Proceso;

    private String Lugar;

    private LocalDate fecha;

    private String NombreGuarderia;

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
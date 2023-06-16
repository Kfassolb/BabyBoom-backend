package com.babyboom.dtos;

import com.babyboom.entities.TipoEnfermedad;

import javax.persistence.Column;
import java.time.LocalDate;

public class BebeDTO {
    private int idBebe;
    private String nombreBebe;
    private LocalDate fechaBebe;
    private TipoEnfermedad tipoEnfermedad;

    public int getIdBebe() {
        return idBebe;
    }

    public void setIdBebe(int idBebe) {
        this.idBebe = idBebe;
    }

    public String getNombreBebe() {
        return nombreBebe;
    }

    public void setNombreBebe(String nombreBebe) {
        this.nombreBebe = nombreBebe;
    }

    public LocalDate getFechaBebe() {
        return fechaBebe;
    }

    public void setFechaBebe(LocalDate fechaBebe) {
        this.fechaBebe = fechaBebe;
    }
    public TipoEnfermedad getTipoEnfermedad() {return tipoEnfermedad;}
    public void setTipoEnfermedad(TipoEnfermedad tipoEnfermedad) {this.tipoEnfermedad = tipoEnfermedad;}
}


package com.babyboom.dtos;

public class TipoEnfermedadDTO {
    private int idTipoEnfermedad;
    private String nombreTipoEnfermedad;
    private String tipoTipoEnfermedad;

    public int getIdTipoEnfermedad() {
        return idTipoEnfermedad;
    }

    public void setIdTipoEnfermedad(int idTipoEnfermedad) {
        this.idTipoEnfermedad = idTipoEnfermedad;
    }

    public String getNombreTipoEnfermedad() {
        return nombreTipoEnfermedad;
    }

    public void setNombreTipoEnfermedad(String nombreTipoEnfermedad) {
        this.nombreTipoEnfermedad = nombreTipoEnfermedad;
    }

    public String getTipoTipoEnfermedad() {
        return tipoTipoEnfermedad;
    }

    public void setTipoTipoEnfermedad(String tipoTipoEnfermedad) {
        this.tipoTipoEnfermedad = tipoTipoEnfermedad;
    }
}
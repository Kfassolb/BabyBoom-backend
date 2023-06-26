package com.babyboom.dtos;

public class ReporteEnfermedadBebeDTO {
    private String nombre_bebe;
    private String nombre_tipo_enfermedad;

    public ReporteEnfermedadBebeDTO() {
    }
    public ReporteEnfermedadBebeDTO(String nombre_bebe, String nombre_tipo_enfermedad) {
        this.nombre_bebe = nombre_bebe;
        this.nombre_tipo_enfermedad = nombre_tipo_enfermedad;
    }

    public String getNombre_bebe() {
        return nombre_bebe;
    }

    public void setNombre_bebe(String nombre_bebe) {
        this.nombre_bebe = nombre_bebe;
    }

    public String getNombre_tipo_enfermedad() {
        return nombre_tipo_enfermedad;
    }

    public void setNombre_tipo_enfermedad(String nombre_tipo_enfermedad) {
        this.nombre_tipo_enfermedad = nombre_tipo_enfermedad;
    }



}

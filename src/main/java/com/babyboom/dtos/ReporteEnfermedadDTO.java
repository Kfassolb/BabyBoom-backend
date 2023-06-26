package com.babyboom.dtos;

public class ReporteEnfermedadDTO {

    private String nombre_tipo_enfermedad;
    private String tipo_tipo_enfermedad;

    public ReporteEnfermedadDTO() {
    }

    public ReporteEnfermedadDTO(String nombre_tipo_enfermedad, String tipo_tipo_enfermedad) {
        this.nombre_tipo_enfermedad = nombre_tipo_enfermedad;
        this.tipo_tipo_enfermedad = tipo_tipo_enfermedad;
    }

    public String getNombre_tipo_enfermedad() {
        return nombre_tipo_enfermedad;
    }

    public void setNombre_tipo_enfermedad(String nombre_tipo_enfermedad) {
        this.nombre_tipo_enfermedad = nombre_tipo_enfermedad;
    }

    public String getTipo_tipo_enfermedad() {
        return tipo_tipo_enfermedad;
    }

    public void setTipo_tipo_enfermedad(String tipo_tipo_enfermedad) {
        this.tipo_tipo_enfermedad = tipo_tipo_enfermedad;
    }
}

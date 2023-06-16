package com.babyboom.dtos;
import java.time.LocalDate;

public class ControlVacunacionDTO {
    private int idControlVacunacion;
    private LocalDate fecha;
    private String tipoVacuna;
    private String estadoVacunacion;
    private String nombreVacunador;
    private String lugar;

    public int getIdControlVacunacion() {
        return idControlVacunacion;
    }

    public void setIdControlVacunacion(int idControlVacunacion) {
        this.idControlVacunacion = idControlVacunacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public String getEstadoVacunacion() {
        return estadoVacunacion;
    }

    public void setEstadoVacunacion(String estadoVacunacion) {
        this.estadoVacunacion = estadoVacunacion;
    }

    public String getNombreVacunador() {
        return nombreVacunador;
    }

    public void setNombreVacunador(String nombreVacunador) {
        this.nombreVacunador = nombreVacunador;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}

package com.babyboom.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "controlvacunaciones")
public class ControlVacunacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idControlVacunacion;
    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;
    @Column(name = "tipoVacuna",length = 10,nullable = false)
    private String tipoVacuna;
    @Column(name = "estadoVacunacion",length = 20,nullable = false)
    private String estadoVacunacion;
    @Column(name = "nombreVacunador",length = 200,nullable = false)
    private String nombreVacunador;
    @Column(name = "lugar",length = 100,nullable = false)
    private String lugar;

    public ControlVacunacion(int idControlVacunacion, LocalDate fecha, String tipoVacuna, String estadoVacunacion, String nombreVacunador, String lugar) {
        this.idControlVacunacion = idControlVacunacion;
        this.fecha = fecha;
        this.tipoVacuna = tipoVacuna;
        this.estadoVacunacion = estadoVacunacion;
        this.nombreVacunador = nombreVacunador;
        this.lugar = lugar;
    }
    public ControlVacunacion() {
    }
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

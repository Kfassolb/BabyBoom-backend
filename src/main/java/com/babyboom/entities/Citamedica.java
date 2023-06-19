package com.babyboom.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "citas")
public class Citamedica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCitaMedica;
    @ManyToOne
    @JoinColumn(name = "idMedico")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "idApoderado")
    private Apoderado apoderado;

    @Column(name = "tituloCita", length = 50, nullable = false)
    private String tituloCita;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "lugar", length = 50, nullable = false)
    private String lugar;

    @Column(name = "nombreClinica", length = 50, nullable = false)
    private String nombreClinica;

    public Citamedica() {
    }

    public Citamedica(int idCitaMedica, Medico medico, Apoderado apoderado, String tituloCita, LocalDate fecha, String lugar, String nombreClinica) {
        this.idCitaMedica = idCitaMedica;
        this.medico = medico;
        this.apoderado = apoderado;
        this.tituloCita = tituloCita;
        this.fecha = fecha;
        this.lugar = lugar;
        this.nombreClinica = nombreClinica;
    }

    public int getIdCitaMedica() {
        return idCitaMedica;
    }

    public void setIdCitaMedica(int idCitaMedica) {
        this.idCitaMedica = idCitaMedica;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Apoderado getApoderado() {
        return apoderado;
    }

    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }

    public String getTituloCita() {
        return tituloCita;
    }

    public void setTituloCita(String tituloCita) {
        this.tituloCita = tituloCita;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNombreClinica() {
        return nombreClinica;
    }

    public void setNombreClinica(String nombreClinica) {
        this.nombreClinica = nombreClinica;
    }
}


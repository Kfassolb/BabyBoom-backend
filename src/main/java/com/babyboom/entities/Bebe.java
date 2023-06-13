package com.babyboom.entities;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "bebes")
public class Bebe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBebe;
    @Column(name = "nombreBebe",length = 25,nullable = false)
    private String nombreBebe;
    @Column(name = "fechaBebe",nullable = false)
    private LocalDate fechaBebe;
    @ManyToOne
    @JoinColumn(name = "idTipoEnfermedad")
    private TipoEnfermedad tipoEnfermedad;

    public Bebe() {
    }
    public Bebe(int idBebe, String nombreBebe, LocalDate fechaBebe) {
        this.idBebe = idBebe;
        this.nombreBebe = nombreBebe;
        this.fechaBebe = fechaBebe;
        this.tipoEnfermedad =tipoEnfermedad;
    }
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
    public TipoEnfermedad getTipoEnfermedad() {
        return tipoEnfermedad;
    }
    public void setTipoEnfermedad(TipoEnfermedad tipoEnfermedad) {
        this.tipoEnfermedad = tipoEnfermedad;
    }
}

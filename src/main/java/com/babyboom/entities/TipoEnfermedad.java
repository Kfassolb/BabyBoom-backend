package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name = "tipoenfermedads")
public class TipoEnfermedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoEnfermedad;
    @Column(name = "nombreTipoEnfermedad",length = 25,nullable = false)
    private String nombreTipoEnfermedad;
    @Column(name = "tipoTipoEnfermedad",length = 35,nullable = false)
    private String tipoTipoEnfermedad;

    public TipoEnfermedad(){

    }

    public TipoEnfermedad(int idTipoEnfermedad, String nombreTipoEnfermedad, String tipoTipoEnfermedad){
        this.idTipoEnfermedad = idTipoEnfermedad;
        this.nombreTipoEnfermedad = nombreTipoEnfermedad;
        this.tipoTipoEnfermedad = tipoTipoEnfermedad;
    }

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


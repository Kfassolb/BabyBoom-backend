package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name = "enfermedad_bebes")
public class Enfermedad_bebe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "idTipoEnfermedad")
    private TipoEnfermedad tipoEnfermedad;
    @ManyToOne
    @JoinColumn(name = "idBebe")
    private Bebe bebe;
    private String sintomas;
    public Enfermedad_bebe() {
    }

    public Enfermedad_bebe(TipoEnfermedad tipoEnfermedad, Bebe bebe) {
        this.tipoEnfermedad = tipoEnfermedad;
        this.bebe = bebe;
        this.sintomas = sintomas;
    }

    public TipoEnfermedad getTipoEnfermedad() {
        return tipoEnfermedad;
    }

    public void setTipoEnfermedad(TipoEnfermedad tipoEnfermedad) {
        this.tipoEnfermedad = tipoEnfermedad;
    }

    public Bebe getBebe() {
        return bebe;
    }

    public void setBebe(Bebe bebe) {
        this.bebe = bebe;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
}

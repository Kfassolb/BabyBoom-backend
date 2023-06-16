package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name = "enfermedad_bebes")
public class Enfermedad_bebe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "idTipoEnfermedad")
    private TipoEnfermedad tipoEnfermedad;
    @ManyToOne
    @JoinColumn(name = "idBebe")
    private Bebe bebe;
    private String sintonmas;
    public Enfermedad_bebe(Long id, TipoEnfermedad tipoEnfermedad, Bebe bebe, String sintonmas) {
        this.id = id;
        this.tipoEnfermedad = tipoEnfermedad;
        this.bebe = bebe;
        this.sintonmas = sintonmas;
    }
    public Enfermedad_bebe() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getSintonmas() {
        return sintonmas;
    }

    public void setSintonmas(String sintonmas) {
        this.sintonmas = sintonmas;
    }
}

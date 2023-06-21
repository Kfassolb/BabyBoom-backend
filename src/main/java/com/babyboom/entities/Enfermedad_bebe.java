package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name = "enfermedad_bebes")
public class Enfermedad_bebe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnfermedadBebe;
    @ManyToOne
    @JoinColumn(name = "idTipoEnfermedad")
    private TipoEnfermedad tipoEnfermedad;
    @ManyToOne
    @JoinColumn(name = "idBebe")
    private Bebe bebe;
    private String sintomas;
    public Enfermedad_bebe(int idEnfermedadBebe, TipoEnfermedad tipoEnfermedad, Bebe bebe, String sintonmas) {
        this.idEnfermedadBebe = idEnfermedadBebe;
        this.tipoEnfermedad = tipoEnfermedad;
        this.bebe = bebe;
        this.sintomas = sintonmas;
    }
    public Enfermedad_bebe() {
    }
    public int getId() {
        return idEnfermedadBebe;
    }

    public void setId(int idEnfermedadBebe) {
        this.idEnfermedadBebe = idEnfermedadBebe;
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
        return sintomas;
    }

    public void setSintonmas(String sintomas) {
        this.sintomas = sintomas;
    }
}

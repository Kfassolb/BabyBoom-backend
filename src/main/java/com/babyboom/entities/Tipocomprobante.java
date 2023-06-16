package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name = "tipocomprobantes")
public class Tipocomprobante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipocomprobante;

    @Column(name = "nombreComprobante",length = 35, nullable = false)
    private String nombreComprobante;

    public Tipocomprobante() {
    }

    public Tipocomprobante(int idTipocomprobante, String nombreComprobante) {
        this.idTipocomprobante = idTipocomprobante;
        this.nombreComprobante = nombreComprobante;
    }

    public int getIdTipocomprobante() {
        return idTipocomprobante;
    }

    public void setIdTipocomprobante(int idTipocomprobante) {
        this.idTipocomprobante = idTipocomprobante;
    }

    public String getNombreComprobante() {
        return nombreComprobante;
    }

    public void setNombreComprobante(String nombreComprobante) {
        this.nombreComprobante = nombreComprobante;
    }
}

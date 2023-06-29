package com.babyboom.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Compra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompra;
    @ManyToOne
    @JoinColumn(name = "idApoderado",nullable = false)
    private Apoderado apoderado;

    @ManyToOne
    @JoinColumn(name = "idTipocomprobante",nullable = false)
    private Tipocomprobante tipocomprobante;

    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;

    @Column(name="ventaTotal",length = 35, nullable = false)
    private int ventaTotal;

    public Compra() {
    }

    public Compra(int idCompra, Apoderado apoderado, Tipocomprobante tipocomprobante, LocalDate fecha, int ventaTotal) {
        this.idCompra = idCompra;
        this.apoderado = apoderado;
        this.tipocomprobante = tipocomprobante;
        this.fecha = fecha;
        this.ventaTotal = ventaTotal;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Apoderado getApoderado() {
        return apoderado;
    }

    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }

    public Tipocomprobante getTipocomprobante() {
        return tipocomprobante;
    }

    public void setTipocomprobante(Tipocomprobante tipocomprobante) {
        this.tipocomprobante = tipocomprobante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getVentaTotal() {
        return ventaTotal;
    }

    public void setVentaTotal(int ventaTotal) {
        this.ventaTotal = ventaTotal;
    }
}

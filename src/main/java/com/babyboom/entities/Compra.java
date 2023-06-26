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
    private Apoderado idApoderado;

    @ManyToOne
    @JoinColumn(name = "idTipoComprobante",nullable = false)
    private Tipocomprobante idTipoComprobante;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name="ventaTotal",nullable = false)
    private int ventaTotal;

    public Compra() {
    }

    public Compra(int idCompra, Apoderado idApoderado, Tipocomprobante idTipoComprobante, LocalDate fecha, int ventaTotal) {
        this.idCompra = idCompra;
        this.idApoderado = idApoderado;
        this.idTipoComprobante = idTipoComprobante;
        this.fecha = fecha;
        this.ventaTotal = ventaTotal;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Apoderado getIdApoderado() {
        return idApoderado;
    }

    public void setIdApoderado(Apoderado idApoderado) {
        this.idApoderado = idApoderado;
    }

    public Tipocomprobante getIdTipoComprobante() {
        return idTipoComprobante;
    }

    public void setIdTipoComprobante(Tipocomprobante idTipoComprobante) {
        this.idTipoComprobante = idTipoComprobante;
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

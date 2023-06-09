package com.babyboom.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Compra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompra;
    @Column(name = "idApoderado", length = 20, nullable = false)
    private int idApoderado;
    @Column(name = "idTipoComprobante",length = 20, nullable = false)
    private int idTipoComprobante;
    @Column(name = "Fecha", nullable = false)
    private LocalDate Fecha;
    private int ventaTotal;

    public Compra() {
    }

    public Compra(int idCompra, int idApoderado, int idTipoComprobante, LocalDate fecha, int ventaTotal) {
        this.idCompra = idCompra;
        this.idApoderado = idApoderado;
        this.idTipoComprobante = idTipoComprobante;
        Fecha = fecha;
        this.ventaTotal = ventaTotal;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdApoderado() {
        return idApoderado;
    }

    public void setIdApoderado(int idApoderado) {
        this.idApoderado = idApoderado;
    }

    public int getIdTipoComprobante() {
        return idTipoComprobante;
    }

    public void setIdTipoComprobante(int idTipoComprobante) {
        this.idTipoComprobante = idTipoComprobante;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public int getVentaTotal() {
        return ventaTotal;
    }

    public void setVentaTotal(int ventaTotal) {
        this.ventaTotal = ventaTotal;
    }
}

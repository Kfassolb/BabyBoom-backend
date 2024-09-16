package com.babyboom.dtos;

import com.babyboom.entities.Tipocomprobante;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class CompraDTO {
    private int idCompra;

    private Apoderado idApoderado;

    private Tipocomprobante idTipoComprobante;

    private LocalDate Fecha;

    private int ventaTotal;

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

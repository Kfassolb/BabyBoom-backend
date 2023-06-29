package com.babyboom.dtos;

import com.babyboom.entities.Apoderado;
import com.babyboom.entities.Tipocomprobante;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class CompraDTO {
    private int idCompra;

    private Apoderado apoderado;

    private Tipocomprobante tipocomprobante;

    private LocalDate fecha;

    private int ventaTotal;

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

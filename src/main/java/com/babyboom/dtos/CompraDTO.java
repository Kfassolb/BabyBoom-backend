package com.babyboom.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class CompraDTO {
    private int idCompra;

    private int idApoderado;

    private int idTipoComprobante;
    private LocalDate Fecha;
    private int ventaTotal;

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

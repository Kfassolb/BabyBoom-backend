package com.babyboom.dtos;

import java.awt.font.NumericShaper;

public class ProductoDTO {

    private int idProducto;

    private String Nombre;

    private String Tipo;

    private Number Cantidad;

    private Number PrecioU;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public Number getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Number cantidad) {
        this.Cantidad = cantidad;
    }

    public Number getPrecioU() {
        return PrecioU;
    }

    public void setPrecioU(Number precioU) {
        this.PrecioU = precioU;
    }
}


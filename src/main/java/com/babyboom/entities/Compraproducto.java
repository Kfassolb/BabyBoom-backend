package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name = "compraproducto")
public class Compraproducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompraProducto;

    @ManyToOne
    @JoinColumn(name = "idApoderado",nullable = false)
    private Apoderado apoderado;

    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto producto;

    @Column(nullable = false)
    private int cantidad;

    public Compraproducto() {
    }

    public Compraproducto(int idCompraProducto, Apoderado apoderado, Producto producto, int cantidad) {
        this.idCompraProducto = idCompraProducto;
        this.apoderado = apoderado;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getIdCompraProducto() {
        return idCompraProducto;
    }

    public void setIdCompraProducto(int idCompraProducto) {
        this.idCompraProducto = idCompraProducto;
    }

    public Apoderado getApoderado() {
        return apoderado;
    }

    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}



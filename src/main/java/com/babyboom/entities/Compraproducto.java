package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name = "compraproducto")
public class Compraproducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idApoderado;

    @ManyToOne
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto producto;

    @Column(nullable = false)
    private int cantidad;

    public Compraproducto() {
    }

    public Compraproducto(int idApoderado, Producto producto, int cantidad) {
        this.idApoderado = idApoderado;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getIdApoderado() {
        return idApoderado;
    }

    public void setIdApoderado(int idApoderado) {
        this.idApoderado = idApoderado;
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



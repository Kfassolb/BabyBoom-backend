package com.babyboom.entities;


import javax.persistence.*;

@Entity
@Table(name= "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    @Column(name="Nombre", length = 35,nullable = false)
    private String Nombre;

    @Column(name="Tipo", length = 12,nullable = false)
    private String Tipo;

    @Column(name="Cantidad", length = 35,nullable = false)
    private Number Cantidad;

    @Column(name="PrecioU", length = 35,nullable = false)
    private Number PrecioU;

    public Producto(){
    }

   public Producto(int idProducto, String Nombre, String Tipo, Number Cantidad, Number PrecioU) {
        this.idProducto = idProducto;
        this.Tipo = Tipo;
        this.Cantidad = Cantidad;
        this.PrecioU = PrecioU;
   }

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

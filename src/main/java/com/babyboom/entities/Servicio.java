package com.babyboom.entities;
import javax.persistence.*;
@Entity
@Table(name="servicios")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;
    @Column(name = "nombreServicio", length = 10, nullable = false)
    private String nombreServicio;
    public Servicio(){
    }
    public Servicio(int idServicio, String nombreServicio) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
    }
    public int getIdServicio() {
        return idServicio;
    }
    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }
    public String getNombreServicio() {
        return nombreServicio;
    }
    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }
}
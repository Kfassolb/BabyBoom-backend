package com.babyboom.entities;
import javax.persistence.*;

@Entity
@Table(name = "servicios")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;
    @Column(name = "nameServicio",length = 40,nullable = false)
    private String nameServicio;
    public Servicio() {
    }

    public Servicio(int idServicio, String nameServicio) {
        this.idServicio = idServicio;
        this.nameServicio = nameServicio;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNameServicio() {
        return nameServicio;
    }

    public void setNameServicio(String nameServicio) {
        this.nameServicio = nameServicio;
    }
}
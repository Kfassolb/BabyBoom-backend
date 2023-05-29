package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name="tiposuscrip")
public class Tiposuscrip {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTiposuscrip;
@Column(name="nombresuscripcion", length = 35, nullable = false)
    private String nombresuscripcion;
public Tiposuscrip(){
}
public Tiposuscrip(int idTiposuscrip, String nombresuscripcion){
this.idTiposuscrip=idTiposuscrip;
this.nombresuscripcion=nombresuscripcion;
}

    public int getIdTiposuscrip() {return idTiposuscrip;}

    public void setIdTiposuscrip(int idTiposuscrip) {
        this.idTiposuscrip = idTiposuscrip;
    }

    public String getNombresuscripcion() {
        return nombresuscripcion;
    }

    public void setNombresuscripcion(String nombresuscripcion) {
        this.nombresuscripcion = nombresuscripcion;
    }
}

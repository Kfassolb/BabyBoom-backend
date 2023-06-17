package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name="apoderados")
public class Apoderado {
    @Id

    private int idApoderado;

    @ManyToOne
    @JoinColumn(name = "id",nullable = false)
    private Users users;
    @ManyToOne
    @JoinColumn(name = "idBebe",nullable = false)
    private Bebe bebe;
    @ManyToOne
    @JoinColumn(name = "idTiposuscrip",nullable = false)
    private Tiposuscrip tiposuscrip;
    @ManyToOne
    @JoinColumn(name = "idGuarderia",nullable = false)
    private Guarderia guarderia;
    @Column(name = "Nombre",nullable = false)
    private String Nombre;
    @Column(name = "Apellido",nullable = false)
    private String Apellido;
    @Column(name = "CorreoElectronico",nullable = false)
    private String CorreoElectronico;

    public int getIdApoderado() {
        return idApoderado;
    }

    public Apoderado() {
    }

    public Apoderado(int idApoderado, Users users, Bebe bebe, Tiposuscrip tiposuscrip, Guarderia guarderia, String nombre, String apellido, String correoElectronico) {
        this.idApoderado = idApoderado;
        this.users = users;
        this.bebe = bebe;
        this.tiposuscrip = tiposuscrip;
        this.guarderia = guarderia;
        Nombre = nombre;
        Apellido = apellido;
        CorreoElectronico = correoElectronico;
    }

    public void setIdApoderado(int idApoderado) {
        this.idApoderado = idApoderado;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Bebe getBebe() {
        return bebe;
    }

    public void setBebe(Bebe bebe) {
        this.bebe = bebe;
    }

    public Tiposuscrip getTiposuscrip() {
        return tiposuscrip;
    }

    public void setTiposuscrip(Tiposuscrip tiposuscrip) {
        this.tiposuscrip = tiposuscrip;
    }

    public Guarderia getGuarderia() {
        return guarderia;
    }

    public void setGuarderia(Guarderia guarderia) {
        this.guarderia = guarderia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }
}

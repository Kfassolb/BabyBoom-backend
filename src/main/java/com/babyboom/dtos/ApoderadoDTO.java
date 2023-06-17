package com.babyboom.dtos;

import com.babyboom.entities.Bebe;
import com.babyboom.entities.Guarderia;
import com.babyboom.entities.Tiposuscrip;
import com.babyboom.entities.Users;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ApoderadoDTO {

    private Users users;

    private Bebe bebe;

    private Tiposuscrip tiposuscrip;

    private Guarderia guarderia;

    private String Nombre;

    private String Apellido;

    private String CorreoElectronico;

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

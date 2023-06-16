package com.babyboom.dtos;

import com.babyboom.entities.Bebe;
import com.babyboom.entities.Guarderia;
import com.babyboom.entities.Tiposuscrip;
import com.babyboom.entities.User;

public class ApoderadoDTO {
    private int idApoderado;
    private User user;
    private Bebe bebe;
    private Tiposuscrip tiposuscrip;
    private Guarderia guarderia;
    private String nombre;
    private String apellido;
    private String email;

    public int getIdApoderado() {
        return idApoderado;
    }

    public void setIdApoderado(int idApoderado) {
        this.idApoderado = idApoderado;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

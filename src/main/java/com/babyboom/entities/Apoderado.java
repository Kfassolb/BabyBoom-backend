package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name = "apoderados")
public class Apoderado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idApoderado;

    @OneToOne
    @JoinColumn(name = "idUser")
    private User user;

    @OneToOne
    @JoinColumn(name = "idBebe")
    private Bebe bebe;

    @OneToOne
    @JoinColumn(name = "idTiposuscrip")
    private Tiposuscrip tiposuscrip;

    @ManyToOne
    @JoinColumn(name = "idGuarderia")
    private Guarderia guarderia;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    public Apoderado() {
    }

    public Apoderado(int idApoderado, User user, Bebe bebe, Tiposuscrip tiposuscrip, Guarderia guarderia, String nombre, String apellido, String email) {
        this.idApoderado = idApoderado;
        this.user = user;
        this.bebe = bebe;
        this.tiposuscrip = tiposuscrip;
        this.guarderia = guarderia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

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

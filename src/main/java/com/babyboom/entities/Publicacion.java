package com.babyboom.entities;

import javax.persistence.*;

@Entity
@Table(name="publicaciones")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacion;
   @Column(name= "tituloPublicacion", length = 60, nullable = false)
    private String tituloPublicacion;
    @Column(name= "comentarioPublicacion", length = 500, nullable = false)
    private String comentarioPublicacion;
    @ManyToOne
    @JoinColumn(name="idComunidad")
    private Comunidad comunidad;
    @ManyToOne
    @JoinColumn(name="idApoderado")
    private Apoderado apoderado;

    public Publicacion(String tituloPublicacion, String comentarioPublicacion, Comunidad comunidad, Apoderado apoderado) {
        this.tituloPublicacion = tituloPublicacion;
        this.comentarioPublicacion = comentarioPublicacion;
        this.comunidad = comunidad;
        this.apoderado = apoderado;
    }

    public Publicacion() {

    }

    public String getTituloPublicacion() {
        return tituloPublicacion;
    }

    public void setTituloPublicacion(String tituloPublicacion) {
        this.tituloPublicacion = tituloPublicacion;
    }

    public String getComentarioPublicacion() {
        return comentarioPublicacion;
    }

    public void setComentarioPublicacion(String comentarioPublicacion) {
        this.comentarioPublicacion = comentarioPublicacion;
    }

    public Comunidad getComunidad() {
        return comunidad;
    }

    public void setComunidad(Comunidad comunidad) {
        this.comunidad = comunidad;
    }

    public Apoderado getApoderado() {
        return apoderado;
    }

    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }
}

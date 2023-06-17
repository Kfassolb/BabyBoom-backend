package com.babyboom.dtos;

import com.babyboom.entities.Comunidad;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PublicacionDTO {

    private String tituloPublicacion;
    private String comentarioPublicacion;
    private Comunidad comunidad;
    private Apoderado apoderado;

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

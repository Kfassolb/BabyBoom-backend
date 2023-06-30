package com.babyboom.dtos;

import com.babyboom.entities.Apoderado;
import com.babyboom.entities.Comunidad;

public class PublicacionDTO {
    private int idPublicacion;
    private String tituloPublicacion;
    private String comentarioPublicacion;
    private Comunidad comunidad;
    private Apoderado apoderado;

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
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

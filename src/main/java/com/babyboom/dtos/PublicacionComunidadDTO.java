package com.babyboom.dtos;

public class PublicacionComunidadDTO {

    private String publicacionName;
private int comunidadCount;

    public PublicacionComunidadDTO(String publicacionName, int comunidadCount) {
        this.publicacionName = publicacionName;
        this.comunidadCount = comunidadCount;
    }

    public PublicacionComunidadDTO() {

    }

    public String getPublicacionName() {
        return publicacionName;
    }

    public void setPublicacionName(String publicacionName) {
        this.publicacionName = publicacionName;
    }

    public int getComunidadCount() {
        return comunidadCount;
    }

    public void setComunidadCount(int comunidadCount) {
        this.comunidadCount = comunidadCount;
    }
}

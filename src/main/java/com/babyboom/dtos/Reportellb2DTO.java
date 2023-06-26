package com.babyboom.dtos;

public class Reportellb2DTO {
    private String nombre;
    private int count;

    public Reportellb2DTO() {
    }

    public Reportellb2DTO(String nombre, int count) {
        this.nombre = nombre;
        this.count = count;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

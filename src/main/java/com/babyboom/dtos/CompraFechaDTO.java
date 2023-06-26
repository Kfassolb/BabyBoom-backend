package com.babyboom.dtos;

public class CompraFechaDTO {
    private int Count;
    private int apoderadoCount;

    public CompraFechaDTO(int count, int apoderadoCount) {
        Count = count;
        this.apoderadoCount = apoderadoCount;
    }

    public CompraFechaDTO() {
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public int getApoderadoCount() {
        return apoderadoCount;
    }

    public void setApoderadoCount(int apoderadoCount) {
        this.apoderadoCount = apoderadoCount;
    }
}

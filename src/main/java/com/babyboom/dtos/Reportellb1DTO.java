package com.babyboom.dtos;

public class Reportellb1DTO {
    private String place;
    private int count;

    public Reportellb1DTO() {
    }

    public Reportellb1DTO(String place, int count) {
        this.place = place;
        this.count = count;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

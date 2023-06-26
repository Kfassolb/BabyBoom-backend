package com.babyboom.dtos;

public class GuarderiaSideDTO {

    private String side;

    private int sideCount;

    public GuarderiaSideDTO() {
    }

    public GuarderiaSideDTO(String side, int sideCount) {
        this.side = side;
        this.sideCount = sideCount;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getSideCount() {
        return sideCount;
    }

    public void setSideCount(int sideCount) {
        this.sideCount = sideCount;
    }
}

package com.babyboom.dtos;

public class GuarderiaSideDTO {

    private String Side;

    private int sideCount;

    public GuarderiaSideDTO() {
    }

    public GuarderiaSideDTO(String side, int sideCount) {
        Side = side;
        this.sideCount = sideCount;
    }

    public String getSide() {
        return Side;
    }

    public void setSide(String side) {
        Side = side;
    }

    public int getSideCount() {
        return sideCount;
    }

    public void setSideCount(int sideCount) {
        this.sideCount = sideCount;
    }
}

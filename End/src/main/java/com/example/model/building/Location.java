package com.example.model.building;

public class Location {
    private final int firstX ;
    private final int firstY ;
    private final int lastX;
    private final int lastY;

    public Location(int firstX, int firstY, int lastX, int lastY) {
        this.firstX = firstX;
        this.firstY = firstY;
        this.lastX = lastX;
        this.lastY = lastY;
    }

    public int getFirstX() {
        return firstX;
    }

    public int getFirstY() {
        return firstY;
    }

    public int getLastX() {
        return lastX;
    }

    public int getLastY() {
        return lastY;
    }
}

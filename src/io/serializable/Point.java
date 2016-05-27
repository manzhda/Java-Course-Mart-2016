package io.serializable;

public class Point implements java.io.Serializable {
    private int x = 0, y = 0;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
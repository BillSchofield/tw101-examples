package com.thoughtworks.oop_intro.major_principles.encapsulation.before;

public class Rover {
    private int x;
    private int y;
    private String heading;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getHeading() {
        return heading;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}

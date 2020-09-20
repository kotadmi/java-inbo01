package ru.kotadmi.Laba1.Pr3.Ex1;

public class Circle {
    private String name;
    private double rad, length;

    public Circle(double rad, String name, double length) {
        this.rad = rad;
        this.name = name;
        this.length = length;
    }
    public double getRadius() {
        return rad;
    }

    public void setRadius(double radius) {
        this.rad = rad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        this.length = length;
    }

    @Override
    public String toString() {
        return "Book {" +
                "radius = '" + rad + '\'' +
                ", length = '" + length + '\'' +
                ", name = " + name +
                '}';
    }
}


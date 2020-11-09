package ru.kotadmi.Laba1.Pr_04;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * getRadius() * getRadius());
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * getRadius());
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius = " + radius +
                ", color = '" + color + '\'' +
                ", filled = " + filled +
                '}';
    }
}

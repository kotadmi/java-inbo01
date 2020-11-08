package ru.kotadmi.Laba1.Pr07.Ex2;

public abstract class Dog {
    protected String shape;
    protected String color;
    protected int size;
    protected boolean chare;
    protected boolean speed;
    protected boolean fluffy;

    public Dog() {
    }
    public Dog(String shape, String color, int size) {
        this.shape = shape;
        this.color = color;
        this.size = size;
    }


    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isChare() {
        return chare;
    }

    public void setChare(boolean chare) {
        this.chare = chare;
    }

    public boolean isSpeed() {
        return speed;
    }

    public void setSpeed(boolean sped) {
        this.speed = speed;
    }

    public boolean isFluffy() {
        return fluffy;
    }

    public void setFluffy(boolean fluffy) {
        this.fluffy = fluffy;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "color = '" + color + '\'' +
                ", size = '" + size + '\'' +
                '}';
    }
}

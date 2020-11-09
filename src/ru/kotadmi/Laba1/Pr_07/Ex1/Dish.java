package ru.kotadmi.Laba1.Pr_07.Ex1;

public abstract class Dish {
    protected String shape;
    protected String color;
    protected String material;
    protected int size;
    protected boolean soup;
    protected boolean power;
    protected boolean tea;

    public Dish() {
    }
    public Dish(String shape, String color, String material, int size) {
        this.shape = shape;
        this.color = color;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public boolean isSoup() {
        return soup;
    }

    public void setSoup(boolean soup) {
        this.soup = soup;
    }

    public boolean isDrink() {
        return tea;
    }

    public void setTea(boolean tea) {
        this.tea = tea;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "color = '" + color + '\'' +
                ", material = '" + material + '\'' +
                ", size = '" + size + '\'' +
                '}';
    }
}

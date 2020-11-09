package ru.kotadmi.Laba1.Pr_07.Ex2;


public class Labrador extends Dog {
    public Labrador(String hair, String color,  int size) {
    super(hair, color, size);
}

    public void fast() {
        setSpeed(true);
    }
    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(int size) {
        super.setSize(size);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public String toString() {
        return "Labrador{" +
                "fast = '" + speed + '\'' +
                ", color = '" + color + '\'' +
                ", size = '" + size + '\'' +
                '}';
    }
}


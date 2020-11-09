package ru.kotadmi.Laba1.Pr_07.Ex2;

public class Cat extends Dog {
    public Cat(String hair, String color,  int size) {
        super(hair, color, size);
    }

    public void fluffy() {
        setFluffy(true);
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
        return "Cat{" +
                "fluffy = '" + fluffy + '\'' +
                ", color = '" + color + '\'' +
                ", size = '" + size + '\'' +
                '}';
    }
}

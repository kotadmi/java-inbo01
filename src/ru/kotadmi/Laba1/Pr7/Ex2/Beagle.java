package ru.kotadmi.Laba1.Pr7.Ex2;

public class Beagle extends Dog{
    public Beagle(String hair, String color,  int size) {
        super(hair, color, size);
    }

    public void friendly() {
        setChare(true);
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
        return "Beagle{" +
                "friendly = '" + chare + '\'' +
                ", color = '" + color + '\'' +
                ", size = '" + size + '\'' +
                '}';
    }
}

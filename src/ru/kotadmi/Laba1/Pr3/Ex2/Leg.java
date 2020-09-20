package ru.kotadmi.Laba1.Pr3.Ex2;

public class Leg {
    private String name;
    private int size;

    public Leg(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Leg {" +
                "name = " + name +
                ", size = '" + size + '\'' +
                '}';
    }
}

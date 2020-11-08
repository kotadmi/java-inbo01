package ru.kotadmi.Laba1.Pr03.Ex2;

public class Hand{
    private String name;
    private int lenth;

    public Hand(int lenth, String name) {
        this.lenth = lenth;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return lenth;
    }

    public void setSize(int lenth) {
        this.lenth = lenth;
    }

    @Override
    public String toString() {
        return "Hand {" +
                "name = " + name +
                ", lenth = '" + lenth + '\'' +
                '}';
    }
}

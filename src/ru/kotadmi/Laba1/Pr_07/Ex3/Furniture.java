package ru.kotadmi.Laba1.Pr_07.Ex3;

public abstract class Furniture {
    private String cl;
    private int size;
    private int cost;
    protected boolean des;

    public int getSize() {
        return size;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getCl() {
        return cl;
    }

    public void setCl(String cl) {
        this.cl = cl;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isDes() {
        return des;
    }

    public void setDes(boolean des) {
        this.des = des;
    }

    public Furniture(String cl) {
        this.cl = cl;
        setCost((int) (Math.random() * 100000));
        setSize((int) (Math.random() * 100));
    }

    @Override
    public String toString() {
        return "Furniture {" +
                "class = '" + cl + '\'' +
                ", size = " + size +
                ", cost = " + cost +
                '}';
    }
}

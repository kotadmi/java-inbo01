package ru.kotadmi.Laba1.Pr_07.Ex3;

public class Sofa extends Furniture{
    private boolean occupied;

    public Sofa(String cl) {
        super(cl);
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isOccupied() {
        return occupied;
    }


    public void des() {
        setDes(true);
    }

    @Override
    public String toString() {
        return super.toString() + " Sofa {" +
                "occupied = " + occupied +
                '}';
    }
}
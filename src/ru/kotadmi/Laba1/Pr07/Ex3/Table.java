package ru.kotadmi.Laba1.Pr07.Ex3;

public class Table extends Furniture {
    private int k;
    private boolean done;

    public Table(String cl) {
        super(cl);
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getK() {
        return k;
    }

    public boolean isDone() {
        return done;
    }

    public void des() {
       setDes(true);
    }

    @Override
    public String toString() {
        return super.toString() + " Table {" +
                "k = " + k +
                ", done = " + done +
                '}';
    }
}

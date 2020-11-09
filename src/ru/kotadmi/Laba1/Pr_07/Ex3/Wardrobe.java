package ru.kotadmi.Laba1.Pr_07.Ex3;

public class Wardrobe extends Furniture {
    private boolean state;

    public Wardrobe(String cl) {
        super(cl);
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    public void des() {
        setDes(true);
    }

    @Override
    public String toString() {
        return super.toString() + " Wardrobe {" +
                "state = " + state +
                '}';
    }
}

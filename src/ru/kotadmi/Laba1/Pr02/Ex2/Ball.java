package ru.kotadmi.Laba1.Pr02.Ex2;

public class Ball {
    private double size;
    private String color, typeOfSport;
    private boolean tanyaCrying;

    public Ball(double size, String color, String typeOfSport, boolean tanyaCrying) {
        this.size = size;
        this.color = color;
        this.typeOfSport = typeOfSport;
        this.tanyaCrying = tanyaCrying;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getTypeOfSport() {
        return typeOfSport;
    }

    public void setTypeOfSport(String typeOfSport) {
        this.typeOfSport = typeOfSport;
    }
    public boolean getTanyaCrying() {
        return tanyaCrying;
    }

    public void setTanyaCrying(boolean tanyaCrying) {
        this.tanyaCrying = tanyaCrying;
    }

    @Override
    public String toString() {
        return "Ball {" +
                "size = " + size +
                ", color = '" + color + '\'' +
                ", type of sport = " + typeOfSport + '\'' +
                ", Tanya is crying = " + tanyaCrying + '\'' +
                '}';
    }
}

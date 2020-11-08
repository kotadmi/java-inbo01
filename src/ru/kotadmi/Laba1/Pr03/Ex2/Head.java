package ru.kotadmi.Laba1.Pr03.Ex2;

public class Head {
    private String hairstyle;
    private boolean smile;

    public Head(boolean smile, String hairstyle) {
        this.smile = smile;
        this.hairstyle = hairstyle;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setName(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    public boolean getSmile() {
        return smile;
    }

    public void setSize(boolean smile) {
        this.smile = smile;
    }

    @Override
    public String toString() {
        return "Head {" +
                "hairstyle = " + hairstyle +
                ", smile = '" + smile + '\'' +
                '}';
    }
}

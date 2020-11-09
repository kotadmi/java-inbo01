package ru.kotadmi.Laba1.Pr_07.Ex1;

public class Cup extends Dish {
    public Cup(String shape, String color, String material, int size) {
        super(shape, color, material, size);
    }

    public void fill() {
        setTea(true);
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

    @Override
    public String getMaterial() {
        return super.getMaterial();
    }

    @Override
    public void setMaterial(String material) {
        super.setMaterial(material);
    }

    public String toString() {
        return "Cup{" +
                "fill = '" + tea + '\'' +
                ", color = '" + color + '\'' +
                ", material = '" + material + '\'' +
                ", size = '" + size + '\'' +
                '}';
    }
}

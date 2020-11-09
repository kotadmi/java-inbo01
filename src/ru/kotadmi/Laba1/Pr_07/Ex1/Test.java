package ru.kotadmi.Laba1.Pr_07.Ex1;

public class Test {
    public static void main(String[] args) {
        Dish cup = new Cup("spherical", "red", "glass", 10);
        Dish plate = new Plate("square", "blue", "glass", 40);
        Dish cutlery = new Сutlery("folk", "grey", "silver", 35);
        System.out.println(cup);
        System.out.println(cutlery);
        System.out.println(plate);
    }
}

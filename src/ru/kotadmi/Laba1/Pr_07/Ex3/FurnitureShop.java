package ru.kotadmi.Laba1.Pr_07.Ex3;

public class FurnitureShop {
    public static void main(String[] args) {
        Furniture sh = new Wardrobe("Мебель для спальни");
        System.out.println(sh);
        Furniture c = new Sofa("Мебель для кухни");
        System.out.println(c);
        Furniture t = new Table("Мебель для кабинета");
        System.out.println(t);
        System.out.println("Что будете покупать?");

    }
}





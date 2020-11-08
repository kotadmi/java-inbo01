package ru.kotadmi.Laba1.Pr07.Ex2;

public class Test {
    public static void main(String[] args) {
        Dog cat = new Cat("short", "black",  10);
        Dog beagle = new Beagle("long", "white",  5);
        Dog labrador = new Labrador("middle", "golden",  3);
        System.out.println(cat);
        System.out.println(beagle);
        System.out.println(labrador);
    }
}

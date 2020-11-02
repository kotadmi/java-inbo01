package ru.kotadmi.Laba1.Pr7.Ex2;

import ru.kotadmi.Laba1.Pr7.Ex2.Cat;
import ru.kotadmi.Laba1.Pr7.Ex2.Dog;
import ru.kotadmi.Laba1.Pr7.Ex2.Beagle;
import ru.kotadmi.Laba1.Pr7.Ex2.Labrador;

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

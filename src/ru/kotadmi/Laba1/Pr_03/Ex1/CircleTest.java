package ru.kotadmi.Laba1.Pr_03.Ex1;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = 0;
        double rad = in.nextDouble();
        String name = in.next();
        Circle circle = new Circle(rad,  name, length);
        circle.setRadius(rad);
        circle.setName(name);
        circle.setLength(2*Math.PI* circle.getRadius());
        System.out.println(circle);
    }
}

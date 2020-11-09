package ru.kotadmi.Laba1.Pr_05;

public class Main {
    public static void main(String[] args) {
        MovableCircle c = new MovableCircle(10,23,6,3,4);
        System.out.println(c);
        c.moveLeft();
        System.out.println(c);
        c.moveDown();
        System.out.println(c);
        c.moveRight();
        System.out.println(c);
        c.moveUp();
        System.out.println(c);
    }
}



package ru.kotadmi.Laba1.Pr03.Ex2;

import java.util.Scanner;
public class Human {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        boolean smile = in.nextBoolean();
        Head head = new Head(smile,name);
        System.out.println(head);
        int a = in.nextInt();
        name = in.next();
        Leg leg1 = new Leg(a,name);
        System.out.println(leg1);
        a = in.nextInt();
        name = in.next();
        Leg leg2 = new Leg(a,name);
        System.out.println(leg2);
        a = in.nextInt();
        name = in.next();
        Hand hand1 = new Hand(a,name);
        System.out.println(hand1);
        a = in.nextInt();
        name = in.next();
        Hand hand2 = new Hand(a,name);
        System.out.println(hand2);
    }
}

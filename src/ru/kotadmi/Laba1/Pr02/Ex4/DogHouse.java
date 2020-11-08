package ru.kotadmi.Laba1.Pr02.Ex4;

import java.util.Scanner;
public class DogHouse {
    public static void main(String[] args) {
        DogHouse a = new DogHouse();
        a.add();
        a.print();
    }
    private Dog [] dog = new Dog[5];
    public void add()
    {
        for (int i = 0; i < dog.length; i++) {
            Scanner in = new Scanner(System.in);
            String name = in.next();
            int age = in.nextInt();
            dog[i] = new Dog(name, age);
        }
    }
    public void print()
    {
        for (int i = 0; i < dog.length; i++)
        {
            System.out.println(dog[i]);
        }
    }
}

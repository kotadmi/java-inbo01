package ru.kotadmi.Laba1.Pr01.Ex7;

public class Main {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        System.out.println(a + "! = " + factorial(a));
        if (a == 0) System.out.println(factorial(a) == 1);
        if (a == 1) System.out.println(factorial(a) == 1);
        if (a == 2) System.out.println(factorial(a) == 2);
        if (a == 3) System.out.println(factorial(a) == 6);
        if (a == 4) System.out.println(factorial(a) == 24);
        if (a == 5) System.out.println(factorial(a) == 120);
        if (a == 6) System.out.println(factorial(a) == 720);
        if (a == 7) System.out.println(factorial(a) == 5040);
        if (a == 8) System.out.println(factorial(a) == 40320);
        if (a == 9) System.out.println(factorial(a) == 1362880);
        if (a == 10) System.out.println(factorial(a) == 3628800);
    }

    public static int factorial(int a)
    {
        if (a <= 1) return 1;
        else return a * factorial(a - 1);
    }
}

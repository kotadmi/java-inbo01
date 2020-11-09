package ru.kotadmi.Laba1.Pr10;

public class Ex02 {
    public static String rec(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + rec(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + rec(a + 1, b);
        }
    }
    public static void main(String[] args) {
        System.out.println(rec(20, 15));
    }
}

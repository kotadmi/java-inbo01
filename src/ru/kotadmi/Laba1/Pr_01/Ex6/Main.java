package ru.kotadmi.Laba1.Pr_01.Ex6;

import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = (int) ((Math.random() * 100));
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("\n");
        for (int i = 0; i < a.length; i++)
            a[i] = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++)
        {
            a[i] = (int) (random.nextInt(100));
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

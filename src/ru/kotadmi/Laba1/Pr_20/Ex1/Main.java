package ru.kotadmi.Laba1.Pr_20.Ex1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static <E> List<E> array2list(E[] array) {
        return Arrays.asList(array);
    }

    public static void main(String[] args) {
        System.out.println(array2list(new Integer[] {1, 2, 3}).getClass());
    }
}

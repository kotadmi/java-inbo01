package ru.kotadmi.Laba1.Pr_17.Ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\LAVETTI\\Documents\\Tanya.txt");
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

}

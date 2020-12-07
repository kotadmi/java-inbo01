package ru.kotadmi.Laba1.Pr_25.Ex3;

import ru.kotadmi.Laba1.Pr_25.Ex2.AddressUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adress = scanner.nextLine();
        ru.kotadmi.Laba1.Pr_25.Ex2.AddressUtils addressUtils = new AddressUtils(adress);
        if (addressUtils.isValidIPv4(adress))
            System.out.println("IP адресс верный");
        else
            System.out.println("IP адресс неверный");
    }
}

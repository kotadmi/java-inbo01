package ru.kotadmi.Laba1.Pr_24.Ex2;

public class Main {

    public static void main(String[] args) {
        System.out.println(
                Address.parseWithSplit("England, London, BakerStreet, 221b",",")
        );
        System.out.println(
                Address.parseWithStringTokenizer("England, London, BakerStreet, 221b",",")
        );
    }

}

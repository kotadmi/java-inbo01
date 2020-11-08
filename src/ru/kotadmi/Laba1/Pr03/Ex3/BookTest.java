package ru.kotadmi.Laba1.Pr03.Ex3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String genre = in.next();
        int date = in.nextInt();
        String name = in.next();
        String author = in.next();
        int numberOfPages = in.nextInt();
        Book book = new Book();
        book.setGenre(genre);
        book.setDate(date);
        book.setName(name);
        book.setAuthor(author);
        book.setNumberOfPages(numberOfPages);
        System.out.println(book);
    }
}

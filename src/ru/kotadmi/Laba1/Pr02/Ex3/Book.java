package ru.kotadmi.Laba1.Pr02.Ex3;

public class Book {
    private String name, genre;
    private int numberOfPages;

    public Book(String genre, String name, int pageCount) {
        this.genre = genre;
        this.name = name;
        this.numberOfPages = numberOfPages;
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book {" +
                "genre = '" + genre + '\'' +
                ", name = '" + name + '\'' +
                ", number of pages = " + numberOfPages +
                '}';
    }
}

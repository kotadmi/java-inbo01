package ru.kotadmi.Laba1.Pr_03.Ex3;

public class Book {
    private String name, author, genre;
    private int numberOfPages,date;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
                ", date = '" + date + '\'' +
                ", name = '" + name + '\'' +
                ", author = '" + author + '\'' +
                ", number of pages = " + numberOfPages +
                '}';
    }
}


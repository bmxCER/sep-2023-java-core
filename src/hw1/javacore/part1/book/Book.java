package hw1.javacore.part1.book;

public class Book {
    private String title;
    private int pages;
    private String authors;
    private String genre;

    public Book(String title, int pages, String authors, String genre){
        this.title = title;
        this.pages = pages;
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthors() {
        return authors;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Book{title="+ title +", pages="+ pages +", authors="+ authors +", genre="+ genre +"}";
    }
}

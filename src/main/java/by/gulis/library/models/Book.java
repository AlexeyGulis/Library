package by.gulis.library.models;

public class Book {
    private int book_id;
    private String name_of_book;
    private String author_of_the_book;
    private int year_of_book;

    public Book() {
    }

    public Book(int book_id, String name_of_book, String author_of_the_book, int year_of_book) {
        this.book_id = book_id;
        this.name_of_book = name_of_book;
        this.author_of_the_book = author_of_the_book;
        this.year_of_book = year_of_book;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getName_of_book() {
        return name_of_book;
    }

    public void setName_of_book(String name_of_book) {
        this.name_of_book = name_of_book;
    }

    public String getAuthor_of_the_book() {
        return author_of_the_book;
    }

    public void setAuthor_of_the_book(String author_of_the_book) {
        this.author_of_the_book = author_of_the_book;
    }

    public int getYear_of_book() {
        return year_of_book;
    }

    public void setYear_of_book(int year_of_book) {
        this.year_of_book = year_of_book;
    }
}

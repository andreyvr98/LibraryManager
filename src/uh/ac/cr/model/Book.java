package uh.ac.cr.model;

public class Book {
    private int id;
    private String bookAuthor;
    private int bookDate;
    private int bookEdition;
    private String bookTitle;
    private String bookEditorial;
    private int bookCopy;

    //atributos libro
    public Book (int id, String bookAuthor, int bookDate, int bookEdition,String bookTitle, String bookEditorial, int bookCopy) {
        this.id = id;
        this.bookAuthor = bookAuthor;
        this.bookDate = bookDate;
        this.bookEdition = bookEdition;
        this.bookTitle = bookTitle;
        this.bookEditorial = bookEditorial;
        this.bookCopy = bookCopy;
    }
}
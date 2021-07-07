package uh.ac.cr.model;


public class Book {
    private int id;
    private String bookAuthor;
    private String bookDate;
    private int bookEdition;
    private String bookTitle;
    private String bookEditorial;
    private int bookCopy;

    //atributos libro
    public Book (int id, String bookAuthor, String bookDate, int bookEdition,String bookTitle, String bookEditorial, int bookCopy) {
        this.id = id;
        this.bookAuthor = bookAuthor;
        this.bookDate = bookDate;
        this.bookEdition = bookEdition;
        this.bookTitle = bookTitle;
        this.bookEditorial = bookEditorial;
        this.bookCopy = bookCopy;

    }public Book() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    public int getbookEdition() {
        return bookEdition;
    }

    public void setBookEdition(int bookEdition) {
        this.bookEdition = bookEdition;
    }

    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public String getBookEditorial() {
        return bookEditorial;
    }

    public void setBookEditorial(String bookEditorial) {
        this.bookEditorial = bookEditorial;
    }

    public int getBookCopy() {
        return bookCopy;
    }

    public void setBookCopy(String editorialNumber) {
        this.bookCopy = bookCopy;
    }


}
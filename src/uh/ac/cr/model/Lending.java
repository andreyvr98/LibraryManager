package uh.ac.cr.model;

    public class Lending {
    private int id;
    private String lendingUser;
    private String lendingBook;
    private String requestDate;
    private String returnDate;
    private Boolean culminate;

//Atributos
    public Lending(int id,String lendingUser, String lendingBook, String requestDate, String returnDate, Boolean culminate) {
        this.id = id;
        this.lendingUser = lendingUser;
        this.lendingBook = lendingBook;
        this.requestDate = requestDate;
        this.returnDate = returnDate;
        this.culminate = culminate;
    }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUserLending() {
            return lendingUser;
        }

        public void setUserLending(String lendingUser) {
            this.lendingUser = lendingUser;
        }

        public String getLendingBook() {
            return lendingBook;
        }

        public void setLendingBook(String lendingBook) {
            this.lendingBook = lendingBook;
        }

        public String getRequestDate() {
            return requestDate;
        }

        public void setRequestDate(String requestDate) {
            this.requestDate = requestDate;
        }
        public String getReturnDate() {
            return returnDate;
        }

        public void setReturnDate(String returnDate) {
            this.returnDate = returnDate;
        }

        public boolean getCulminate() {
            return culminate;
        }

        public void setCulminate(boolean culminate) {
            this.culminate = culminate;
        }


    }

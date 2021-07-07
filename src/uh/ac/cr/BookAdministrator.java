package uh.ac.cr;

import uh.ac.cr.model.Book;


import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;


public class BookAdministrator {
        private ArrayList<Book> booksList = new ArrayList<>();


        public BookAdministrator() {
        }
        //crear libro

        public void addBookToList(Book book) {
            booksList.add(book);
        }

        public boolean existBook(int id) {
            boolean found = false;
            int bookIterator = 0;
            while (!found && bookIterator < booksList.size()) {
                if (booksList.get(bookIterator).getId() == id) {
                    found = true;
                }
                bookIterator++;
            }
            return found;
        }


        public boolean createBook(int id, String author, String date, int edition, String title,String editorial, int copy) {
            boolean bookCreated = false;
            if (!existBook(id)) {
                Book newBook = new Book(id, author, date, edition, title, editorial, copy);
                this.addBookToList(newBook);
                bookCreated = true;
            }
            return bookCreated;
        }

        //Obtener datos de un libro

        public void getBook (int bookId){
            boolean found = false;
            int bookIterator = 0;
            while (!found && bookIterator <  booksList.size()){
                if (booksList.get(bookIterator).getId() == bookId){
                    found = true;
                }
                else {
                    bookIterator++;
                }
            }
            if (found == true){
                System.out.println("Id: " + booksList.get(bookIterator).getId() + "\nAutor: " + booksList.get(bookIterator).getBookAuthor() + "\nFecha de publicación: " + booksList.get(bookIterator).getBookDate() +  "\nEdición: " + booksList.get(bookIterator).getbookEdition() + "\nTítulo: " + booksList.get(bookIterator).getBookTitle() + "\nEditorial: " + booksList.get(bookIterator).getBookEditorial() + "\nCopias: " + booksList.get(bookIterator).getBookCopy() + "\n");
            }else {
                System.out.println("El libro con el id: " + bookId + " no esta registrado.\n");
            }
        }

        //Eliminar un libro

        public void deleteBook (int bookId){
            boolean found = false;
            int bookIterator = 0;
            while (!found && bookIterator <  booksList.size()){
                if (booksList.get(bookIterator).getId() == bookId){
                    found = true;
                }
                else {
                    bookIterator++;
                }
            }
            if (found == true){
                booksList.remove(bookIterator);
                System.out.println("Se a eliminado los datos del libro con el id: " + bookId + " correctamente.\n ");
            }else {
                System.out.println("El libro con el id: " + bookId + " no a sido registrado.\n");
            }
        }

        //Lista de libros registrados

        public String printBook() {
            String bookToPrint = "";
            int bookIterator = 0;
            while (bookIterator < booksList.size()){
                bookToPrint = bookToPrint + booksList.get(bookIterator).getId() + " - " + booksList.get(bookIterator).getBookTitle() + "\n" ;
                bookIterator++;
            }
            return bookToPrint;
        }
        public String getBookLending(int id){
            boolean found = false;
            String book = null;
            int bookIterator = 0;
            while(!found && bookIterator < booksList.size()){
                if(booksList.get(bookIterator).getId() == id){
                    found = true;
                    book = booksList.get(bookIterator).getBookTitle();
                }
                bookIterator++;
            }
            return book;
        }
        // Copias de libros disponible.

        public int amountCopy(int bookId){
            int bookIterator = 0;
            int numberCopy;
            boolean found = false;
            while (!found){
                if (bookId == booksList.get(bookIterator).getId()){
                    found = true;
                }else {
                    bookIterator++;
                }
            }
            numberCopy = booksList.get(bookIterator).getBookCopy();

            return numberCopy;

        }
        // Libros disponibles para prestar

        public void availableBook(int numberCopy, int counterLackCulminate) {
            int amountCopys = numberCopy - counterLackCulminate;

            if (amountCopys > 0) {
                System.out.println("Hay a disposición: " + amountCopys + " copias del libro.\n");
            }else {
                System.out.println("No hay a disposición copias de libro; "  + "\n");
            }
        }





}




package uh.ac.cr;

import uh.ac.cr.model.Lending;
import java.util.ArrayList;

public class LendingAdministrator {
    private ArrayList<Lending> lendingsList =new ArrayList<>();


    public LendingAdministrator(){
    }

    public void addLendingToList(Lending lending){
        lendingsList.add(lending);
    }

    //Validar si el ID del prestado existe

    public boolean existLending(int id) {
        boolean found = false;
        int lendingIterator = 0;
        while (!found && lendingIterator < lendingsList.size()) {
            if( lendingsList.get(lendingIterator).getId() == id) {
                found = true;
            }
            lendingIterator++;
        }
        return found;
    }

    //Crear un nuevo prestamo

    public boolean createLending(int id, String lendingUser, String lendingBook, String requestDate,String returnDate, boolean culminate) {
        boolean bookCreated = false;
        if (!existLending(id)) {
            culminate = false;
            Lending newLending = new Lending(id,lendingUser,lendingBook,requestDate,returnDate,culminate);
            this.addLendingToList(newLending);
            bookCreated = true;
        }
        return bookCreated;
    }

    // Validación de prestamos sin culminar existentes
    public int culminateLending(){
        int lendingIterator = 0;
        int counterLackCulminate =0;

        while (lendingsList.size() > lendingIterator){
            if (lendingsList.get(lendingIterator).getCulminate()){
                counterLackCulminate++;
            }else {
                lendingIterator++;
            }
        }
        return counterLackCulminate;
    }
    //Impresion de prestamos no culminados
    public String printlending() {


        String lendingToPrint = "";
        int lendingIterator = 0;
        while (lendingIterator < lendingsList.size()) {
            lendingToPrint = lendingToPrint + lendingsList.get(lendingIterator).getId() + " - " + lendingsList.get(lendingIterator).getUserLending() + "\n";
            lendingIterator++;

        }
        return lendingToPrint;
    }

    //Se modifica el prestamo a culminado.

    public void endLending(int lendingId){
        boolean found = false;
        int lendingIterator = 0;
        while (!found && lendingIterator <  lendingsList.size()){
            if (lendingsList.get(lendingIterator).getId() == lendingId){
                found = true;
                lendingsList.get(lendingIterator).setCulminate(true);
                System.out.println("Su prestamo se culmino correctamente");
            }
            else {
                lendingIterator++;
            }
        }
    }

    //Ver todos los préstamos solicitados por un usuario

    public void getUserLending (String lendingUser){
        int lendingIterator = 0;
        while (lendingIterator <  lendingsList.size()){
            if (lendingsList.get(lendingIterator).getUserLending() == lendingUser){
                System.out.println("Id: " + lendingsList.get(lendingIterator).getId() + "\nNombre usuario: " + lendingsList.get(lendingIterator).getUserLending() + "\nNombre de libro solicitado: " + lendingsList.get(lendingIterator).getLendingBook() + "\nFecha solicitado: "+ lendingsList.get(lendingIterator).getRequestDate() + "\nFecha devulición:"+ lendingsList.get(lendingIterator).getReturnDate() + "\nPrestamo culminado :"+ lendingsList.get(lendingIterator).getCulminate());
                lendingIterator++;
            }
        }

    }
    //Consultar todos los préstamos realizados de un libro.
    public void getBookLending (String lendingBook){
        int lendingIterator = 0;
        while (lendingIterator <  lendingsList.size()) {
            if (lendingsList.get(lendingIterator).getLendingBook() == lendingBook){
                System.out.println("Id: " + lendingsList.get(lendingIterator).getId() + "\nNombre usuario: " + lendingsList.get(lendingIterator).getUserLending() + "\nNombre de libro solicitado: " + lendingsList.get(lendingIterator).getLendingBook() + "\nFecha solicitado: "+ lendingsList.get(lendingIterator).getRequestDate() + "\nFecha devulición:"+ lendingsList.get(lendingIterator).getReturnDate() + "\nPrestamo culminado :"+ lendingsList.get(lendingIterator).getCulminate());

            }else {
                System.out.println("El libro con el id: "+ lendingBook +" no tiene prestamos.");

            }
            lendingIterator++;
        }
    }

}

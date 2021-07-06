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

    // Validación de prestamos sin culminar existentes.
    public int culminateLending( ){
        int lendingIterator = 0;
        int counterLackCulminate =0;

        while (lendingsList.size() < lendingIterator){
            if (!lendingsList.get(lendingIterator).getCulminate()){
                counterLackCulminate++;
            }else {
                lendingIterator++;
            }
        }
        return counterLackCulminate;
    }





}

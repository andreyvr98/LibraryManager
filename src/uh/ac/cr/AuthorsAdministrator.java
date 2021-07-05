package uh.ac.cr;

import uh.ac.cr.model.Authors;
import java.util.ArrayList;

public class AuthorsAdministrator {
    private ArrayList<Authors> authorsList = new ArrayList<>();

    public AuthorsAdministrator(){
    }
    private void addAuthorsToList( Authors authors){
        authorsList.add(authors);
    }

    public boolean existsAuthors(int id) {
        boolean found = false;
        int authorsIterator = 0;
        while (!found && authorsIterator < authorsList.size()){
            if (authorsList.get(authorsIterator).getId() == id){
                found = true;
            }
            authorsIterator++;
        }
        return found;
    }

    public boolean createAuthors(int id, String name, String lastName, String secondSumername, String dateBirth){
        boolean authorsCreate = false;
        if (!existsAuthors(id)){
            Authors newAuthors = new Authors(id, name, lastName, secondSumername, dateBirth);
            this.addAuthorsToList(newAuthors);
            authorsCreate = true;
        }
        return authorsCreate;
    }
    public void getAuthor (int authorsId){
        boolean found = false;
        int authorIterator = 0;
        while (!found && authorIterator <  authorsList.size()){
            if (authorsList.get(authorIterator).getId() == authorsId){
                found = true;
            }
            else {
                authorIterator++;
                }
        }
        if (found == true){
            System.out.println("Id: " + authorsList.get(authorIterator).getId() + "\nNombre: " + authorsList.get(authorIterator).getName() + "\nPrimer apellido: "+ authorsList.get(authorIterator).getLastName() + "\nSegundo apellido:"+ authorsList.get(authorIterator).getSecondSumername() + "\nFecha de nacimiento: " + authorsList.get(authorIterator).getDate() + "\n" );
        }else {
            System.out.println("El autor con el id: " + authorsId + "  no esta registrado. \n");
        }
    }



    public void updateAuthor (int authorsId, String authorName, String authorLastName, String authorScondSurname, String authorDateBirth){
        boolean found = false;
        int authorIterator = 0;
        while (!found && authorIterator <  authorsList.size()){
            if (authorsList.get(authorIterator).getId() == authorsId){
                found = true;
            }
            else {
                authorIterator++;
            }
        }
        if (found == true){
            authorsList.get(authorIterator).setName(authorName);
            authorsList.get(authorIterator).setLastName(authorLastName);
            authorsList.get(authorIterator).setSecondSumername(authorScondSurname);
            authorsList.get(authorIterator).setDate(authorDateBirth);
            System.out.println("Se a actualizado los datos del autor con el id: " + authorsId + " correctamente.\n ");
        } else {
            System.out.println("El autor con el id: " + authorsId + " no a sido registrado.\n");
        }
    }
    public void deleteAuthor (int authorsId){
        boolean found = false;
        int authorIterator = 0;
        while (!found && authorIterator <  authorsList.size()){
            if (authorsList.get(authorIterator).getId() == authorsId){
                found = true;
            }
            else {
                authorIterator++;
            }
        }
        if (found == true){
            authorsList.remove(authorIterator);
            System.out.println("Se a eliminado los datos del autor con el id: " + authorsId + " correctamente.\n ");
        }else {
            System.out.println("El autor con el id: " + authorsId + " no a sido registrado.\n");
        }
    }
    public String printAuthor() {
        String authorsToPrint = "";
        int authorsIterator = 0;
        while (authorsIterator < authorsList.size()){
            authorsToPrint = authorsToPrint + authorsList.get(authorsIterator).getId() + " - " + authorsList.get(authorsIterator).getName() + "\n" ;
            authorsIterator++;
        }
        return authorsToPrint;
    }
    public java.lang.String getAuthors(int id){
        boolean found = false;
        java.lang.String author = null;
        int authorIterator = 0;
        while(!found && authorIterator < authorsList.size()){
            if(authorsList.get(authorIterator).getId() == id){
                found = true;
                author = authorsList.get(authorIterator).getName();
            }
            authorIterator++;
        }
        return author;
    }
}

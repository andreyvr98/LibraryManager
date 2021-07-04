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

    public boolean createAuthors(int id, String name, String lastName, String secondSumername, int dateBirth){
        boolean authorsCreate = false;
        if (!existsAuthors(id)){
            Authors newAuthors = new Authors(id, name, lastName, secondSumername, dateBirth);
            this.addAuthorsToList(newAuthors);
            authorsCreate = true;
        }
        return authorsCreate;
    }

    public int searchAuthor(int id){
        boolean found = false;
        int authorsIterator = 0;
        while (!found){
            if (authorsList.get(authorsIterator).getId() == id){
                found = true;
            }
            authorsIterator++;
        }
        return authorsIterator;
    }

    //public String getAuthor(int id){
      //  boolean authorfound;
        //if (!existsAuthors(id)){
          //  String authorToPrint = "";
            //while (searchAuthor() < authorsList.size()){
              //  authorToPrint =
            //}
        //}

    //}

}

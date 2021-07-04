package uh.ac.cr;

import uh.ac.cr.model.Editorial;

import java.util.ArrayList;

public class EditorialAdministrator {
    private ArrayList<Editorial> editorialList = new ArrayList<>();

    public EditorialAdministrator(){
    }
    private void addEditorialToList(Editorial editorial){
        editorialList.add(editorial);
    }

    public boolean existsEditorial(int id){
        boolean found = false;
        int editorialIterator = 0;
        while (!found && editorialIterator < editorialList.size()){
            if (editorialList.get(editorialIterator).getId() == id){
            found = true;
            }
            editorialIterator++;
        }
        return found;
    }

    public boolean createEditorial (int id, String name, String editorialLocation, int editorialNumber ){
        boolean editorialCreate = false;
        if (!existsEditorial(id)){
            Editorial newEditorial = new Editorial(id, name, editorialLocation, editorialNumber);
            this.addEditorialToList(newEditorial);
        }
        return editorialCreate;
    }



}

package uh.ac.cr;

import uh.ac.cr.model.Editorial;
import java.util.Calendar;

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

    public boolean createEditorial (int id, String name, String editorialLocation, String editorialNumber ){
        boolean editorialCreate = false;
        if (!existsEditorial(id)){
            Editorial newEditorial = new Editorial(id, name, editorialLocation, editorialNumber);
            this.addEditorialToList(newEditorial);
            editorialCreate = true;
        }
        return editorialCreate;
    }


    //Buscar editorial especifica


    public void geteditorial (int editorialId){
        boolean found = false;
        int editorialIterator = 0;
        while (!found && editorialIterator <  editorialList.size()){
            if (editorialList.get(editorialIterator).getId() == editorialId){
                found = true;
            }
            else {
                editorialIterator++;
            }
        }
        if (found == true){
            System.out.println("Id: " + editorialList.get(editorialIterator).getId() + "\nNombre: " + editorialList.get(editorialIterator).getName() + "\nUbicación fisica: " + editorialList.get(editorialIterator).getEditorialLocation() +  "\nTelefono de contacto: " + editorialList.get(editorialIterator).getEditorialNumber() + "\n");
        }else {
            System.out.println("La editorial con el id: " + editorialId + " no esta registrado.");
        }
    }


    //Eliminar editorial

    public void deleteEditorial (int editorialId){
        boolean found = false;
        int userIterator = 0;
        while (!found && userIterator <  editorialList.size()){
            if (editorialList.get(userIterator).getId() == editorialId){
                found = true;
            }
            else {
                userIterator++;
            }
        }
        if (found == true){
            editorialList.remove(userIterator);
            System.out.println("Se a eliminado los datos de la editorial con el id: " + editorialId + " correctamente.\n ");
        }else {
            System.out.println("La editorial con el id: " + editorialId + "no a sido registrado.\n");
        }
    }

    //Imprimir editoriales

    public String printEditorial() {
        String editorialToPrint = "";
        int editorialIterator = 0;
        while(editorialIterator < editorialList.size()){
            editorialToPrint = editorialToPrint + editorialList.get(editorialIterator).getId() + " - " + editorialList.get(editorialIterator).getName() + "\n" ;
            editorialIterator++;
        }
        return editorialToPrint;
    }
}

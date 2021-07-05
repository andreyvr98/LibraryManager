package uh.ac.cr;

import uh.ac.cr.model.User;

import java.util.ArrayList;

public class UserAdministrator {
    private ArrayList<User> usersList =new ArrayList<>();

    public UserAdministrator(){
    }

    private void addUserToList(User user){
        usersList.add(user);
    }
//Validar si existe o no un usuario
    public boolean existsUser(int id) {
        boolean found = false;
        int userIterator = 0;
        while(!found && userIterator < usersList.size()){
            if(usersList.get(userIterator).getId() == id){
                found = true;
            }
            userIterator++;
        }
        return found;
    }
    //Crear un usuario
    public boolean createUser(int id, String name, String lastName, String secondSurname, String userNumber){
        boolean patientCreated = false;
        if(!existsUser(id)){
            User newUser = new User(id, name, lastName, secondSurname, userNumber);
            this.addUserToList(newUser);
            patientCreated = true;
        }
        return patientCreated;
    }
    //Obtener usuario especifico.

    public void getUser (int usersId){
        boolean found = false;
        int usersIterator = 0;
        while (!found && usersIterator <  usersList.size()){
            if (usersList.get(usersIterator).getId() == usersId){
                found = true;
            }
            else {
                usersIterator++;
            }
        }
        if (found == true){
            System.out.println("Id: " + usersList.get(usersIterator).getId() + "\nNombre: " + usersList.get(usersIterator).getName() + "\nPrimer apellido: "+ usersList.get(usersIterator).getLastName() + "\nSegundo apellido:"+ usersList.get(usersIterator).getLastName() + "\nTelefono de contacto: " + usersList.get(usersIterator).getUserNumber() + "\n");
        }else {
            System.out.println("El usuario con el id: " + usersId + " no esta registrado.\n");
        }
    }
    //Actualizar usuario
    public void updateUser (int userId, String userName, String userLastName, String userSecondSurname, String userNumber ){
        boolean found = false;
        int userIterator = 0;
        while (!found && userIterator <  usersList.size()){
            if (usersList.get(userIterator).getId() == userId){
                found = true;
            }
            else {
                userIterator++;
            }
        }
        if (found == true){
            usersList.get(userIterator).setName(userName);
            usersList.get(userIterator).setLastName(userLastName);
            usersList.get(userIterator).setSecondSurname(userSecondSurname);
            usersList.get(userIterator).setUserNumber(userNumber);

            System.out.println("Se a actualizado los datos del usuario con el id: " + userId + " correctamente.\n ");
        } else {
            System.out.println("El usuario con el id: " + userId + " no a sido registrado.\n");
        }
    }
    //Eliminar usuario
    public void deleteUser (int userId){
        boolean found = false;
        int userIterator = 0;
        while (!found && userIterator <  usersList.size()){
            if (usersList.get(userIterator).getId() == userId){
                found = true;
            }
            else {
                userIterator++;
            }
        }
        if (found == true){
            usersList.remove(userIterator);
            System.out.println("Se a eliminado los datos del usuario con el id: " + userId + " correctamente.\n ");
        }else {
            System.out.println("El usuario con el id: " + userId + " no a sido registrado.\n");
        }
    }

    // Lista de usuarios

    public String printUser() {
        String userToPrint = "";
        int userIterator = 0;
        while (userIterator < usersList.size()){
            userToPrint = userToPrint + usersList.get(userIterator).getId() + " - " + usersList.get(userIterator).getName() + "\n" ;
            userIterator++;
        }
        return userToPrint;
    }
    public java.lang.String getUserLending(int id){
        boolean found = false;
        java.lang.String user = null;
        int userIterator = 0;
        while(!found && userIterator < usersList.size()){
            if(usersList.get(userIterator).getId() == id){
                found = true;
                user = usersList.get(userIterator).getName();
            }
            userIterator++;
        }
        return user;
    }


}

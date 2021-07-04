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
    public boolean createUser(int id, String name, String lastName, String secondSurname, int userNumber){
        boolean patientCreated = false;
        if(!existsUser(id)){
            User newUser = new User(id, name, lastName, secondSurname, userNumber);
            this.addUserToList(newUser);
            patientCreated = true;
        }
        return patientCreated;
    }
}

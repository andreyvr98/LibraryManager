package uh.ac.cr.model;

public class User {
    private int id;
    private String name;
    private String lastName;
    private String secondSurname;
    private int userNumber;

    //atributos usuario
    public User(int id, String name, String lastName, String secondSurname, int userNumber) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.secondSurname = secondSurname;
        this.userNumber = userNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }
}
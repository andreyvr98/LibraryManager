package uh.ac.cr.model;

public class Authors {
    private int id;
    private String name;
    private  String lastName;
    private String secondSurname;
    private int dateBirth;

//autor atributos
    public Authors(int id, String name, String lastName, String secondSumername, int date){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.secondSurname = secondSumername;
        this.dateBirth = dateBirth;
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

    public String getSecondSumername() {
        return secondSurname;
    }

    public void setSecondSumername(String secondSumername) {
        this.secondSurname = secondSumername;
    }

    public int getDate() {
        return dateBirth;
    }

    public void setDate(int date) {
        this.dateBirth = date;
    }
}

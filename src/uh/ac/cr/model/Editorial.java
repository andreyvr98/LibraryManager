package uh.ac.cr.model;

public class Editorial {
    private int id;
    private String name;
    private  String editorialLocation;
    private String editorialNumber;

    // Atributos editorial
    public Editorial(int id, String name, String editorialLocation, String editorialNumber) {
        this.id = id;
        this.name = name;
        this. editorialLocation = editorialLocation;
        this.editorialNumber = editorialNumber;
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

    public String getEditorialLocation() {
        return editorialLocation;
    }

    public void setEditorialLocation(String editorialLocation) {
        this.editorialLocation = editorialLocation;
    }

    public String getEditorialNumber() {
        return editorialNumber;
    }

    public void setEditorialNumber(String editorialNumber) {
        this.editorialNumber = editorialNumber;
    }
}



package uh.ac.cr.model;

public class Editorial {
    private int id;
    private String name;
    private  String editorialLocation;
    private String editorialNumber;

    // Atributos editorial
    public Editorial(int id, String name, String editorialLocation, int contactNumber) {
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

    public String getPhysicalLocation() {
        return editorialLocation;
    }

    public void setPhysicalLocation(String physicalLocation) {
        this.editorialLocation = physicalLocation;
    }

    public String getContactNumber() {
        return editorialNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.editorialNumber = contactNumber;
    }
}



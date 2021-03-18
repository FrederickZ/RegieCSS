package com.regie.css.model;

public class Instructor {

    private String cnetid;
    private String firstName;
    private String last_name;

    public Instructor(String cnetid, String firstName, String last_name) {
        this.cnetid = cnetid;
        this.firstName = firstName;
        this.last_name = last_name;
    }

    public String getCnetid() {
        return cnetid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLast_name() {
        return last_name;
    }
}

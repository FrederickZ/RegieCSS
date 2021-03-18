package com.regie.css.model;

public class Course {
    private Department department;
    private int number;
    private String name;

    public Course(Department department, int number, String name) {
        this.department = department;
        this.number = number;
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.regie.css.model;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private Course course;
    private int year;
    private String quarter;
    private int session = 1;
    private Instructor instructor;
    private List<Slot> classTimes = new ArrayList<Slot>();

    public Schedule(Course course, int year, String quarter) {
        this.course = course;
        this.year = year;
        this.quarter = quarter;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Slot> getClassTimes() {
        return classTimes;
    }

    public void setClassTimes(List<Slot> classTimes) {
        this.classTimes = classTimes;
    }
}

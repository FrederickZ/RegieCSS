package com.regie.css.model;

public class Department {
    private String abbr;
    private String title;

    public Department(String abbr, String title) {
        this.abbr = abbr;
        this.title = title;
    }

    public String getAbbr() {
        return abbr;
    }

    public String getTitle() {
        return title;
    }
}

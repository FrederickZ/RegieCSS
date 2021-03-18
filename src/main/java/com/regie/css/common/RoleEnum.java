package com.regie.css.common;

public enum RoleEnum {
    ADMIN("admin"),
    DEPARTMENT_ADMIN("department admin"),
    INSTRUCTOR("instructor");

    private String jsonExp;

    RoleEnum(String jsonExp) {
        this.jsonExp = jsonExp;
    }

    public String getJsonExp() {
        return jsonExp;
    }
}

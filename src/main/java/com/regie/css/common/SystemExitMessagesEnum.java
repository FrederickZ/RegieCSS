package com.regie.css.common;

public enum SystemExitMessagesEnum {
    INVALID_INPUT("Invalid input."),
    USER_NOT_FOUND("User not found.");

    private String message;

    SystemExitMessagesEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "EXIT: " + message;
    }
}

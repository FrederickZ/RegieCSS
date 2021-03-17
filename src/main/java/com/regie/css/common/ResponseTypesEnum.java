package com.regie.css.common;

import com.regie.css.util.Response;

public enum ResponseTypesEnum {
    SUCCESS,
    ERROR,
    USER_NOT_FOUND_EXIT(SystemExitMessagesEnum.USER_NOT_FOUND.getMessage());

    private Response response = new Response();

    ResponseTypesEnum() {
        this.response.put("status", this.name().toLowerCase());
    }

    ResponseTypesEnum(String message) {
        this.response.put("status", this.name().toLowerCase());
        this.response.put("message", message);
    }

    public Response getResponse() {
        return response;
    }
}

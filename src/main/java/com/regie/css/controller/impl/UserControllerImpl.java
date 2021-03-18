package com.regie.css.controller.impl;

import com.regie.css.common.ResponseTypesEnum;
import com.regie.css.controller.UserController;
import com.regie.css.service.UserService;
import com.regie.css.service.impl.ServiceRegistry;
import com.regie.css.service.impl.UserServiceImpl;
import com.regie.css.util.Request;
import com.regie.css.util.Response;

public class UserControllerImpl implements UserController {
    private final UserService userService = (UserService) ServiceRegistry.getService("User");

    @Override
    public Response login(Request request) {
        String id = (String) request.get("id");

        String role = userService.getUserRole(id);
        if (role == null) {
            return ResponseTypesEnum.USER_NOT_FOUND_EXIT.getResponse();
        }
        Response response = ResponseTypesEnum.SUCCESS.getResponse();
        response.put("role", role);

        return response;
    }
}

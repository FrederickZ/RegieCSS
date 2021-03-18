package com.regie.css.service.impl;

import com.regie.css.common.Constants;
import com.regie.css.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String getUserRole(String id) {
        if (id.equals(Constants.ADMIN_ID)) {
            return "admin";
        }
        if (id.length() == 4) {
            // TODO DepartmentAdminRepo
            return "department admin";
        }
        if (id.length() >= 6) {
            // TODO InstructorRepo
            return "instructor";
        }
        return null;
    }
}

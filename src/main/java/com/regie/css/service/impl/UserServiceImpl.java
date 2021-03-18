package com.regie.css.model.service.impl;

import com.regie.css.model.service.UserService;
import com.regie.css.infrastructure.repository.UserRepo;

public class UserServiceImpl implements UserService {
    UserRepo userRepo;
    @Override
    public String getUserRole(String id) {
        if (id.equals("regie")) {
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

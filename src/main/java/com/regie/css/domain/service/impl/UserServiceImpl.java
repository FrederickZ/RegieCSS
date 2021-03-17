package com.regie.css.domain.service.impl;

import com.regie.css.domain.service.UserService;
import com.regie.css.infrastructure.repository.UserRepo;

public class UserServiceImpl implements UserService {
    UserRepo userRepo;
    @Override
    public String getUserRole(String id) {
        if (id.equals("regie")) {
            return "ADMIN";
        }
        if (id.length() == 4) {
            // TODO DepartmentAdminRepo
        }
        if (id.length() >= 6) {
            // TODO InstructorRepo
        }
        return null;
    }
}

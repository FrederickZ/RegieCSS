package com.regie.css.view;

import com.regie.css.common.RoleEnum;
import com.regie.css.controller.UserController;
import com.regie.css.controller.impl.ControllerRegistry;
import com.regie.css.controller.impl.UserControllerImpl;
import com.regie.css.util.Args;
import com.regie.css.util.Request;
import com.regie.css.util.Response;
import com.regie.css.view.ui.AdminUIPage;
import com.regie.css.view.ui.DepartmentAdminUIPage;
import com.regie.css.view.ui.InstructorUIPage;

/* css.regie.com/login */

public class LoginPage extends Page {
    public static final String PATH = "/login";

    public LoginPage(Args args) {
        super(args);
    }

    @Override
    public void run() {
        System.out.print("Please login with your system id: ");
        String id = scanner.next();
        Request request = new Request();
        request.put("id", id);
        UserController userController = (UserController) ControllerRegistry.getController("User");
        Response response = userController.login(request);
        if (response.get("status").equals("exit")) {
            System.out.println(response);
            System.exit(0);
        }

        String role = (String) response.get("role");

        Args args = new Args();
        args.put("id", id);
        if (role.equals(RoleEnum.ADMIN.getJsonExp())) {
            redirect(new AdminUIPage(args));
        } else if (role.equals(RoleEnum.DEPARTMENT_ADMIN.getJsonExp())) {
            redirect(new DepartmentAdminUIPage(args));
        } else {
            redirect(new InstructorUIPage(args));
        }

    }

}

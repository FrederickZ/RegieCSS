package com.regie.css.view;

import com.regie.css.controller.UserController;
import com.regie.css.controller.impl.UserControllerImpl;
import com.regie.css.util.Request;
import com.regie.css.util.Response;

public class LoginPage extends Page {
    private static Page page = null;
    private UserController userController = new UserControllerImpl();

    @Override
    public void run() {
        System.out.print("Please login with your system id: ");
        String id = scanner.next();
        Request request = new Request();
        request.put("id", id);
        Response response = userController.login(request);
        if (response.get("status").equals("exit")) {
            System.out.println(response);
            System.exit(0);
        }

        String role = (String) response.get("role");

        if (role.equals("ADMIN")) {
            redirect(new AdminUIPage());
        }
    }
}

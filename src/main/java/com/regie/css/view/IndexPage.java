package com.regie.css.view;

import com.regie.css.controller.UserController;
import com.regie.css.util.Args;
import com.regie.css.util.Request;
import com.regie.css.util.Response;

/* css.regie.com */

public class IndexPage extends Page {
    public static final String PATH = "/";

    public IndexPage(Args args) {
        super(args);
    }

    @Override
    public void run() {
        System.out.println("Welcome to Course Scheduling System - REGIE!");
        redirect(new LoginPage(new Args()));
    }
}

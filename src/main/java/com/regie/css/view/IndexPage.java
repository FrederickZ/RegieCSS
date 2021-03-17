package com.regie.css.view;

import com.regie.css.controller.UserController;
import com.regie.css.util.Request;
import com.regie.css.util.Response;

public class IndexPage extends Page {
    private static IndexPage indexPage = null;

    private IndexPage() {}

    public static IndexPage getIndexPage() {
        if (indexPage == null) {
            indexPage = new IndexPage();
        }
        return indexPage;
    }

    @Override
    public void run() {
        System.out.println("Welcome to Course Scheduling System - REGIE!");

        redirect(new LoginPage());
    }
}

package com.regie.css.view.ui;

/* css.regie.com/department-admin?id=<id> */

import com.regie.css.util.Args;

public class DepartmentAdminUIPage extends UIPage {
    public final String PATH = String.format("/department-admin?id=%s", args.get("id"));

    public DepartmentAdminUIPage(Args args) {
        super(args);
    }

    @Override
    public void run() {
        System.out.println("Welcome, department admin!");
    }
}

package com.regie.css.view.ui;

import com.regie.css.util.Args;

public class InstructorUIPage extends UIPage {
    public final String PATH = String.format("/instructor?id=%s", args.get("id"));

    public InstructorUIPage(Args args) {
        super(args);
    }

    @Override
    public void run() {
        System.out.println("Welcome, instructor!");
    }
}

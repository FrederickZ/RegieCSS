package com.regie.css.view;

import com.regie.css.util.Args;

import java.util.Scanner;

public abstract class Page {
    public Args args;
    public static final Scanner scanner = new Scanner(System.in);

    public Page(Args args) {
        this.args = args;
    }

    public abstract void run();
    public void redirect(Page redirectedPage) {
        redirectedPage.run();
    }
}

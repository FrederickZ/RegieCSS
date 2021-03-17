package com.regie.css.view;

import com.regie.css.util.Body;
import com.regie.css.util.Request;

import java.util.Scanner;

public abstract class Page {
    Scanner scanner = new Scanner(System.in);

    public abstract void run();
    public void redirect(Page redirectedPage) {
        redirectedPage.run();
    }
}

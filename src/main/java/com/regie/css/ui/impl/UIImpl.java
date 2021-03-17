package com.regie.css.ui.impl;

import com.regie.css.ui.UI;

import java.util.Scanner;

public abstract class UIImpl implements UI {
    static UI instance;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        System.out.print("Please login with your CNetId: ");
        String cnetID = scanner.next();
        login(cnetID);
        System.out.println("How can I help you today?");
    }
}

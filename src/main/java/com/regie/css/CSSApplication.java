package com.regie.css;

import com.regie.css.ui.UI;
import com.regie.css.ui.impl.AdminUIImpl;

import java.util.Scanner;

public class CSSApplication {
    private static UI uiInstance;

    public static void main(String[] args) {
        System.out.println("Welcome to Course Scheduling System - REGIE!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your role: 1)Admin 2)DepartmentAdmin 3)Instructor    ");
        int roleIndex = scanner.nextInt();
        configure(roleIndex);
        uiInstance.run();
    }

    private static void configure(int roleIndex) {
        if (roleIndex == 1) {
            uiInstance = AdminUIImpl.getInstance();
        } else if (roleIndex == 2) {
            System.out.println("Please login with your CNetId as an instructor");
        } else if (roleIndex == 3){
            System.out.println("Please login with your CNetId as an instructor");
        } else {
            System.out.println("Invalid input.");
            System.exit(0);
        }
    }
}

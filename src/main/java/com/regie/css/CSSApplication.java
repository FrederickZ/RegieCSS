package com.regie.css;

import com.regie.css.common.SystemExitMessagesEnum;
import com.regie.css.controller.UserController;
import com.regie.css.view.IndexPage;

import java.util.Scanner;

public class CSSApplication {
    private static IndexPage indexPage = IndexPage.getIndexPage();

    public static void main(String[] args) {
        System.out.print("Have you configured the database already? (Y/N) ");
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        if (input == 'N' || input == 'n') {
            // configure database
        } else if (input != 'Y' && input != 'y') {
            System.out.println(SystemExitMessagesEnum.INVALID_INPUT.getMessage());
            System.exit(0);
        }
        indexPage.run();
    }

}

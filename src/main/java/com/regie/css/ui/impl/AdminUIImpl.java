package com.regie.css.ui.impl;

import com.regie.css.ui.AdminUI;
import com.regie.css.ui.UI;

public class AdminUIImpl extends UIImpl implements AdminUI {

    private AdminUIImpl() {};

    public static UI getInstance() {
        if (instance == null) {
            instance = new AdminUIImpl();
        }
        return instance;
    }


    @Override
    public void login(String cnetID) {
        if (!cnetID.equals("rzimmer")) {
            System.out.println("SYSTEM EXIT: Invalid credential.");
            System.exit(0);
        }
    }
}

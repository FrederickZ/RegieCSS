package com.regie.css.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnection {
    private static final String BASE_URL = "jdbc:mysql://localhost:3306/";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String DATABASE = "regie";

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties properties = new Properties();
                properties.put("user", USERNAME);
                properties.put("password", PASSWORD);
                conn = DriverManager.getConnection(BASE_URL + DATABASE, properties);
                System.out.println("Connected to MySQL database.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

}

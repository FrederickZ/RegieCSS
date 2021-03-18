package com.regie.css;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.regie.css.common.SystemExitMessagesEnum;
import com.regie.css.controller.UserController;
import com.regie.css.util.Args;
import com.regie.css.util.MongoDBDataSource;
import com.regie.css.view.IndexPage;
import org.bson.Document;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class CSSApplication {

    public static void main(String[] args) {
        System.out.print("Have you configured the database already? (Y/N) ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.toUpperCase().equals("N")) {
            prepareDemo();
        } else if (!input.toUpperCase().equals("Y")) {
            System.out.println(SystemExitMessagesEnum.INVALID_INPUT.getMessage());
            System.exit(0);
        }
        IndexPage indexPage = new IndexPage(new Args());
        indexPage.run();
    }

    private static void prepareDemo() {
        // MySQL
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "root");
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", properties);
            String sql = "CREATE DATABASE IF NOT EXISTS regie";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.executeUpdate();
            System.out.println("MySQL database created successfully.");
            System.out.println("Please use your terminal to configure tables and demo data by:" +
                    "$ mysql -u root -p regie < src/main/resources/db/20210318T1610-create_tables.sql" +
                    "$ mysql -u root -p regie < src/main/resources/db/dump_demo.sql"
            );
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("EXIT: Failed to prepare MySQL database for demo.");
            System.exit(0);
        }
        System.out.println("----------------------------------------------------------");

        // MongoDB
        MongoClient mongoClient = MongoClients.create();
        MongoDatabase database = mongoClient.getDatabase("regie");
        MongoCollection<Document> collection = database.getCollection("todo");
        Document document = new Document()
                .append("user", "regie")
                .append("content", "Start course scheduling procedure");
        collection.insertOne(document);
        System.out.println("MongoDB database completely prepared.");
        System.out.println("----------------------------------------------------------");

        System.out.println("Please rerun the program.");
        System.exit(0);
    }
}

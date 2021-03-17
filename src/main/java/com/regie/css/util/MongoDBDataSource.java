package com.regie.css.util;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;


public class MongoDBDataSource {
    private static final MongoClient mongoClient = MongoClients.create();
    private static final String DATABASE = "regie";

    private static MongoDatabase database = null;

    public static MongoDatabase getDatabase() {
        if (database == null) {
            database = mongoClient.getDatabase(DATABASE);
        }
        return database;
    }

}

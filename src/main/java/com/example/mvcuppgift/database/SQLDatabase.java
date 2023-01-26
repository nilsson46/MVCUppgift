package com.example.mvcuppgift.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDatabase {

    private static SQLDatabase instance;
    private Connection connection;

    private SQLDatabase() {
        String url = "jdbc:mysql://localhost:3306/springjdbc";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, "root", "");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static SQLDatabase getInstance() {
        if (instance == null) {
            instance = new SQLDatabase();
        }

        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}


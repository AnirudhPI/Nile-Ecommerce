package com.nile.ecommerce.repository;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private Dotenv dotenv;

    public DatabaseManager() {
        dotenv = Dotenv.load(); // Loads .env file
    }

    public Connection getConnection() throws SQLException {
        String url = dotenv.get("DB_URL");
        String username = dotenv.get("DB_USERNAME");
        String password = dotenv.get("DB_PASSWORD");

        return DriverManager.getConnection(url, username, password);
    }

    public void testConnection() {
        try {
            String url = dotenv.get("DB_URL");
            String username = dotenv.get("DB_USERNAME");
            String password = dotenv.get("DB_PASSWORD");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connection successful!");
            connection.close();

        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }
}

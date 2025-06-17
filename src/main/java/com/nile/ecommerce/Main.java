package com.nile.ecommerce;

import com.nile.ecommerce.controller.RestApiHandler;
import com.nile.ecommerce.repository.DatabaseManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Order Processing System Starting...");

        // TODO: Test database connection
        DatabaseManager dbManager = new DatabaseManager();
        dbManager.testConnection();

        // TODO: Start HTTP server
        try {
            RestApiHandler apiHandler = new RestApiHandler();
            apiHandler.startServer();
        } catch (Exception e) {
            System.out.println("Failed to start server: " + e.getMessage());
        }

        // TODO: Initialize inventory cache
    }
}

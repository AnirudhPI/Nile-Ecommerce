package com.nile.ecommerce.controller;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.net.InetSocketAddress;

public class RestApiHandler implements HttpHandler {
    private HttpServer server;

    public void startServer() throws IOException {
        server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Add context handlers
        server.createContext("/order", this);
        server.createContext("/inventory", this);

        server.setExecutor(null); // Default executor
        server.start();

        System.out.println("Server started on http://localhost:8080");
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String path = exchange.getRequestURI().getPath();
        String method = exchange.getRequestMethod();

        System.out.println("Received: " + method + " " + path);

        // TODO: Route to specific handlers
        sendResponse(exchange, "Hello from API!", 200);
    }

    private void sendResponse(HttpExchange exchange, String response, int statusCode) throws IOException {
        exchange.sendResponseHeaders(statusCode, response.length());
        exchange.getResponseBody().write(response.getBytes());
        exchange.getResponseBody().close();
    }
}
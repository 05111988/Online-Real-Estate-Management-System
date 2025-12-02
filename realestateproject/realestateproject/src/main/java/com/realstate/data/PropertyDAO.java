package com.realestate.data;

import com.realestate.model.Property;
import com.realestate.model.ResidentialProperty;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// Interface is omitted for brevity, but this class would implement DatabaseOperation<Property>

public class PropertyDAO {
    // JDBC connection details - CHANGE IF YOUR USER/PASSWORD ARE DIFFERENT!
    private static final String URL = "jdbc:mysql://localhost:3306/realestate_db";
    private static final String USER = "root"; // Replace with your MySQL username
    private static final String PASSWORD = "Lakshika81@"; // Replace with your MySQL password

    private Connection getConnection() throws SQLException {
        // Step 1: Establish Connection
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Demonstrates JDBC, Collections (List), and Generics
    public List<Property> getAll() throws SQLException {
        List<Property> properties = new ArrayList<>(); // Collections/Generics
        String sql = "SELECT id, address, price, type, bedrooms FROM properties";
        
        // Use try-with-resources for automatic resource closing (JDBC best practice)
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            // Process ResultSet
            while (rs.next()) {
                int id = rs.getInt("id");
                String address = rs.getString("address");
                double price = rs.getDouble("price");
                String type = rs.getString("type");
                
                Property p = null;
                
                // Logic to reconstruct the correct subclass (Polymorphism)
                if (type.equals("Residential")) {
                    int beds = rs.getInt("bedrooms"); 
                    p = new ResidentialProperty(id, address, price, beds);
                } 
                // Add checks for other types (Commercial, Land) here if implemented
                
                if (p != null) {
                    properties.add(p);
                }
            }
        } // Connection, Statement, and ResultSet are closed automatically here
        return properties;
    }
    
    // Note: Synchronization might be implemented here if multiple threads were writing
    // public synchronized void save(Property p) { ... }
}
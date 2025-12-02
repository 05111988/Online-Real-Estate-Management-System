package com.realestate.model;

// Base Class demonstrating Inheritance
public abstract class Property {
    private int propertyId;
    private String address;
    private double price;

    public Property(int propertyId, String address, double price) {
        this.propertyId = propertyId;
        this.address = address;
        this.price = price;
    }

    // Abstract method: Must be implemented by subclasses (Polymorphism)
    public abstract String getTypeDetails();
    
    // Concrete method
    public String getDisplayDetails() {
        return "ID: " + propertyId + ", Address: " + address + ", Price: $" + String.format("%.2f", price);
    }

    // Getters
    public int getPropertyId() { return propertyId; }
    public String getAddress() { return address; }
    public double getPrice() { return price; }
}

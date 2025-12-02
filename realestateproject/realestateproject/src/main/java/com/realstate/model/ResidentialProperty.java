package com.realestate.model;

// Derived Class demonstrating Inheritance and Polymorphism
public class ResidentialProperty extends Property {
    private int numberOfBedrooms;

    public ResidentialProperty(int propertyId, String address, double price, int numberOfBedrooms) {
        super(propertyId, address, price);
        this.numberOfBedrooms = numberOfBedrooms;
    }

    // Implementation of the abstract method (Polymorphism)
    @Override
    public String getTypeDetails() {
        return "Residential (Beds: " + numberOfBedrooms + ")";
    }
    
    // Getter specific to this class
    public int getNumberOfBedrooms() { return numberOfBedrooms; }
}
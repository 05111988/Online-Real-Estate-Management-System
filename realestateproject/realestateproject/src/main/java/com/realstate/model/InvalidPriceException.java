package com.realestate.model;

// Custom Exception for Exception Handling
public class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}
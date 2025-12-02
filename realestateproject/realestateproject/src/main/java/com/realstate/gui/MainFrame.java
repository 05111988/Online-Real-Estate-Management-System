package com.realstate.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.realestate.data.PropertyDAO;
import com.realestate.model.Property;
import java.util.List;
import java.sql.SQLException;

public class MainFrame extends JFrame {

    private JTextArea outputArea;
    private PropertyDAO propertyDAO;
    
    // Constructor to set up the main window
    public MainFrame() {
        super("Online Real Estate Management System");
        
        // Initialize DAO
        propertyDAO = new PropertyDAO();

        // 1. Setup the Frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());

        // 2. Create Components
        outputArea = new JTextArea("Welcome to the System!\n");
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        JButton searchButton = new JButton("Search All Properties (Multithreaded)");

        // 3. Add Components to the Frame
        add(scrollPane, BorderLayout.CENTER);
        add(searchButton, BorderLayout.SOUTH);

        // 4. Implement Multithreaded Action
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Keep the GUI responsive by running the DB task in a new thread
                runSearchInNewThread();
            }
        });

        // Make the window visible
        setVisible(true);
    }
    
    private void runSearchInNewThread() {
        outputArea.append("Searching database... Please wait.\n");
        
        // Multithreading implementation
        Thread searchThread = new Thread(() -> {
            try {
                // Call the DAO method (which uses JDBC)
                List<Property> properties = propertyDAO.getAll();
                
                // Use SwingUtilities.invokeLater to safely update the GUI from the worker thread
                SwingUtilities.invokeLater(() -> {
                    outputArea.append("--- Search Complete (" + properties.size() + " found) ---\n");
                    for (Property p : properties) {
                        // Polymorphism in action: calling getTypeDetails()
                        outputArea.append(p.getDisplayDetails() + " | Type: " + p.getTypeDetails() + "\n"); 
                    }
                });

            } catch (SQLException ex) {
                SwingUtilities.invokeLater(() -> {
                    outputArea.append("!!! Database Error: " + ex.getMessage() + " !!!\n");
                });
            }
        });
        
        searchThread.start();
    }


    public static void main(String[] args) {
        // Run the GUI creation on the Event Dispatch Thread (standard Swing practice)
        SwingUtilities.invokeLater(() -> {
            new MainFrame();
        });
    }
}
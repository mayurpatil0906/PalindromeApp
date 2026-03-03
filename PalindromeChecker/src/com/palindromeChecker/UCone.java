package com.palindromeChecker;

public class UCone {
	    // Application constants (Good practice in DSA design)
	    private static final String APP_NAME = "PalindromeChecker App";
	    private static final String VERSION = "Version 1.0";

	    // Main method – Entry point of JVM
	    public static void main(String[] args) {

	        // Step 1: Display welcome message
	        displayWelcomeMessage();

	        // Step 2: Control flow decision (for now just exit)
	        System.out.println("\nApplication initialized successfully.");
	        System.out.println("Ready for next use case...");
	    }

	    // Separate method for displaying welcome message
	    private static void displayWelcomeMessage() {
	        
	        System.out.println("AppNAme:     " + APP_NAME);
	        System.out.println("Version:     " + VERSION);
	       
	        System.out.println("Welcome to the Palindrome Checker Application!");
	    }
	}



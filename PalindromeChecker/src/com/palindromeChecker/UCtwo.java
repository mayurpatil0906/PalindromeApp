package com.palindromeChecker;

public class UCtwo  {

    
    public static void main(String[] args) {

        // Step 1: Hardcoded string
        String input = "naman";

        // Step 2: Assume it is palindrome initially
        boolean isPalindrome = true;

        // Step 3: Loop till half of string length
        for (int i = 0; i < input.length() / 2; i++) {

            // Compare characters from start and end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // Stop loop if mismatch found
            }
        }

        // Step 4: Display result
        System.out.println("Input String: " + input);

        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome ");
        } else {
            System.out.println("Result: It is NOT a Palindrome ");
        }
    }
}
package com.palindromeChecker;

public class UCfour {
	 public static void main(String[] args) {

	        // Declare input string
	        String s = "radar";

	        // Convert string into character array
	        char[] chars = s.toCharArray();

	        // Initialize two pointers
	        int start = 0;
	        int end = chars.length - 1;

	        // Assume palindrome initially
	        boolean isPalindrome = true;

	        // Compare characters using two-pointer technique
	        while (start < end) {

	            if (chars[start] != chars[end]) {
	                isPalindrome = false;
	                break;
	            }

	            start++;
	            end--;
	        }

	        // Display result
	        System.out.println("Input String: " +s);

	        if (isPalindrome) {
	            System.out.println("Result: It is a Palindrome ");
	        } else {
	            System.out.println("Result: It is NOT a Palindrome ");
	        }
	    }
}

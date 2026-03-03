package com.palindromeChecker;

public class UCthree {
	 public static void main(String[] args) {

	        
	        String input = "naman";

	        //  Variable to store reversed string
	        String reversed = "";

	        //Reverse using loop (from last index to first)
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed = reversed + input.charAt(i);
	        }

	        //Display original and reversed
	        System.out.println("Original String : " + input);
	        System.out.println("Reversed String : " + reversed);

	        // Compare using equals()
	        if (input.equals(reversed)) {
	            System.out.println("Result: It is a Palindrome ");
	        } else {
	            System.out.println("Result: It is NOT a Palindrome ");
	        }
	    }

}

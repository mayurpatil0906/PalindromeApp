package com.palindromeChecker;

public class UCtwelve {
	 public static void main(String[] args) {

	        String input = "civic";

	        PalindromeStrategy strategy = new StackStrategy(); // change strategy here

	        boolean result = strategy.check(input);

	        System.out.println("Input : " + input);
	        System.out.println("Is Palindrome? : " + result);
	    }

}

package com.palindromeChecker;

public class UCten {
	public static void main(String[] args) {

        String input = "Madam";

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        boolean result = normalized.equals(reversed);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

}

package com.palindromeChecker;
class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }
}
public class UCeleven {
	public static void main(String[] args) {

        String input = "civic";

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

}

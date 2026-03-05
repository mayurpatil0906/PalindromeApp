package com.palindromeChecker;
import java.util.Deque;
import java.util.ArrayDeque;
public class UCseven {
	public static void main(String[] args) {
		String input = "radar";
		// Create Deque
		Deque<Character> deque = new ArrayDeque<>();
		// Insert characters into deque
		for (int i = 0; i < input.length(); i++) {
			deque.addLast(input.charAt(i));
		}
		boolean isPalindrome = true;
		// Compare front and rear elements
		while (deque.size() > 1) {
			char front = deque.removeFirst(); // remove from front
			char rear = deque.removeLast();   // remove from rear
			if (front != rear) {
				isPalindrome = false;
				break;
			}
		}
		// Display result
		System.out.println("Input String: " + input);
		System.out.println("Is Palindrome? : " + isPalindrome);
	}
}



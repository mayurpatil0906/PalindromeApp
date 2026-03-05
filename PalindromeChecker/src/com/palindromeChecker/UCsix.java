package com.palindromeChecker;
import java.util.*;
public class UCsix {
	public static void main(String[] args) {
		String s="naman";
		Stack<Character> stack=new Stack<>();
		Queue<Character> queue=new LinkedList<>();
		for (int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			stack.push(ch);
			queue.add(ch);
		}
		boolean isPalindrome=true;
		for(int i=0;i<s.length();i++) {
			char poppedfromQueue=queue.poll();
			char poppedfromStack=stack.pop();
			if (poppedfromQueue!=poppedfromStack) {
				isPalindrome=false;
				break;
			}
		}
		System.out.println("Input String: " + s);

        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome ");
        } else {
            System.out.println("Result: It is NOT a Palindrome ");
        }
			
		}
}
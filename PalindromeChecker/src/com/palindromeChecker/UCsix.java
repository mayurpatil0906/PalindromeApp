package com.palindromeChecker;
import java.util.*;
public class UCsix {
	public static void main(String[] args) {
		String s="naman";
		Stack<Character> stack=new Stack<>();//create Stack
		Queue<Character> queue=new LinkedList<>();//create Queue
		for (int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			stack.push(ch);//pushed element
			queue.add(ch);//add element
		}
		boolean isPalindrome=true;
		while (!queue.isEmpty()) { 
			char poppedfromQueue=queue.poll();//poped element from queue
			char poppedfromStack=stack.pop();//popped element from Stack
			if (poppedfromQueue!=poppedfromStack) { //compare popped elements
				isPalindrome=false;
				break;
			}
		}
		System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
			
		}
}

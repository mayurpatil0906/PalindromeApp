package com.palindromeChecker;

public class UCthirteen {
	    public static boolean reverseMethod(String input) {  // Method 1: Reverse String
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }    
    public static boolean twoPointerMethod(String input) {   // Two Pointer
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
           if (input.charAt(start) != input.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
       String input = "naman";
       long start1 = System.nanoTime(); // Measure time for reverse method
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;
        
        long start2 = System.nanoTime(); // Measure time for two pointer method
        boolean result2 = twoPointerMethod(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + result1);
        System.out.println("Execution Time (Reverse Method) : " + time1 + " ns");
        System.out.println("Execution Time (Two Pointer Method) : " + time2 + " ns");
    }

}

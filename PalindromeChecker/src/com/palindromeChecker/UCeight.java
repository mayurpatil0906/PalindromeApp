package com.palindromeChecker;
import java.util.*;
public class UCeight {

    // Node class for Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Convert String to Linked List
    public static Node createLinkedList(String input) {

        Node head = null;
        Node tail = null;

        for (int i = 0; i < input.length(); i++) {

            Node newNode = new Node(input.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    // Reverse linked list
    public static Node reverse(Node head) {

        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Check palindrome
    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle using fast & slow pointers
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);

        Node firstHalf = head;

        // Compare both halves
        while (secondHalf != null) {

            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {

        // Hardcoded input
        String input = "madam";

        // Convert to linked list
        Node head = createLinkedList(input);

        // Check palindrome
        boolean result = isPalindrome(head);

        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome: " + result);

          
    }
}
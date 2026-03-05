import java.util.*;
public class Performance  {

    //  Hardcoded check
    public static boolean hardcodedCheck(String s) {
        return s.equals("naman");
    }

    // Reverse String
    public static boolean reverseMethod(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return s.equals(rev);
    }

    // Char Array Two Pointer
    public static boolean charArrayMethod(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end])
                return false;
            start++;
            end--;
        }
        return true;
    }

    //  Stack Method
    public static boolean stackMethod(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray())
            stack.push(c);

        for (char c : s.toCharArray()) {
            if (c != stack.pop())
                return false;
        }

        return true;
    }

    // Queue + Stack
    public static boolean queueStackMethod(String s) {

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop())
                return false;
        }

        return true;
    }

    //  Deque Method
    public static boolean dequeMethod(String s) {

        Deque<Character> deque = new LinkedList<>();

        for (char c : s.toCharArray())
            deque.add(c);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }

    // Recursion
    public static boolean recursionMethod(String s, int start, int end) {

        if (start >= end)
            return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        return recursionMethod(s, start + 1, end - 1);
    }

    // Ignore case and spaces
    public static boolean ignoreCaseSpace(String s) {

        s = s.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            if (s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "naman";

        Map<String, Long> times = new LinkedHashMap<>();

        long start, end;

        start = System.nanoTime();
        hardcodedCheck(input);
        end = System.nanoTime();
        times.put("UC2 Hardcoded", end - start);

        start = System.nanoTime();
        reverseMethod(input);
        end = System.nanoTime();
        times.put("UC3 Reverse String", end - start);

        start = System.nanoTime();
        charArrayMethod(input);
        end = System.nanoTime();
        times.put("UC4 Char Array", end - start);

        start = System.nanoTime();
        stackMethod(input);
        end = System.nanoTime();
        times.put("UC5 Stack", end - start);

        start = System.nanoTime();
        queueStackMethod(input);
        end = System.nanoTime();
        times.put("UC6 Queue + Stack", end - start);

        start = System.nanoTime();
        dequeMethod(input);
        end = System.nanoTime();
        times.put("UC7 Deque", end - start);

        start = System.nanoTime();
        recursionMethod(input, 0, input.length() - 1);
        end = System.nanoTime();
        times.put("UC9 Recursion", end - start);

        start = System.nanoTime();
        ignoreCaseSpace(input);
        end = System.nanoTime();
        times.put("UC10 Ignore Case", end - start);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : true\n");

        long minTime = Long.MAX_VALUE;
        String fastest = "";

        for (String key : times.keySet()) {

            long time = times.get(key);

            System.out.println(key + " Execution Time : " + time + " ns");

            if (time < minTime) {
                minTime = time;
                fastest = key;
            }
        }

        System.out.println("\nFastest Algorithm : " + fastest);
    }
}
    


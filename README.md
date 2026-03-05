UC12: Strategy Pattern for Palindrome Algorithms
Goal :Select different palindrome algorithms dynamically using Strategy Pattern.

Flow:
Create PalindromeStrategy interface
Implement different strategies such as:
StackStrategy
DequeStrategy
Choose strategy at runtime
Execute palindrome check
Display result

Key Concepts:
Interface
Defines a contract for palindrome algorithms.

Polymorphism
Different implementations behave differently through the same interface.

Strategy Pattern
Allows changing algorithms without modifying main logic.

Data Structure:
Varies depending on strategy
(Stack, Deque, Array)

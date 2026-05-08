# 🔄 PalindromeChecker App — Java Console-Based Palindrome Validation System

> A console-based Java application designed to validate whether a given string is a palindrome using multiple algorithms and data structures while strengthening core Java programming, Object-Oriented Programming, recursion, and data structure concepts.

---

# 📋 Table of Contents

- [Project Overview](#project-overview)
- [Problem Statement](#problem-statement)
- [Core Features](#core-features)
- [Use Case Scenarios](#use-case-scenarios)
- [Object-Oriented Concepts](#object-oriented-concepts)
- [Data Structures Used](#data-structures-used)
- [Design Patterns Applied](#design-patterns-applied)
- [Application Architecture](#application-architecture)
- [Project Structure](#project-structure)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [Sample Console Flow](#sample-console-flow)
- [Performance Comparison](#performance-comparison)
- [Non-Functional Requirements](#non-functional-requirements)
- [Educational Goals](#educational-goals)
- [Future Enhancements](#future-enhancements)
- [License](#license)

---

# 📌 Project Overview

The **PalindromeChecker App** is a modular Java application developed to demonstrate multiple palindrome validation approaches using different programming techniques and data structures.

The project is designed to strengthen understanding of:

- Core Java Syntax
- Control Flow
- Strings
- Arrays
- Stack
- Queue
- Deque
- Linked List
- Recursion
- Object-Oriented Programming
- Design Patterns
- Algorithm Optimization
- Performance Comparison

The application progressively evolves from simple hardcoded logic to advanced object-oriented and strategy-based implementations.

---

# 🌍 Problem Statement

Palindrome validation is a classical programming problem frequently used to teach:

- String manipulation
- Data structures
- Algorithm design
- Recursion
- Memory optimization
- Logical thinking

Instead of implementing only one solution, this project demonstrates multiple approaches so learners can understand:

- Time complexity differences
- Space optimization
- Data structure behavior
- Real-world architectural design

The project focuses on modularity, maintainability, and algorithmic understanding.

---

# ✨ Core Features

| Module | Features |
|---|---|
| 🚀 Application Startup | Welcome message & initialization |
| 🔤 Basic Validation | Hardcoded palindrome checking |
| 🔄 Reverse Logic | String reversal approach |
| 🔡 Character Comparison | Array-based palindrome checking |
| 📚 Stack Processing | LIFO-based validation |
| 🔁 Queue + Stack | FIFO vs LIFO comparison |
| 📦 Deque Optimization | Front-rear optimized checking |
| 🔗 Linked List Validation | Pointer-based palindrome logic |
| ♻️ Recursive Checking | Recursion-based validation |
| 🎯 Case Insensitivity | Ignore spaces & letter casing |
| 🧠 OOP Service Design | Encapsulated palindrome service |
| ⚙️ Strategy Pattern | Dynamic algorithm selection |
| 📊 Performance Metrics | Compare execution speed |

---

# 🧩 Use Case Scenarios

---

# 🚀 UC1 — Application Entry & Welcome Message

## Goal

Display startup information and initialize the application.

---

## Key Concepts

- Class
- Main Method
- Static Keyword
- Console Output
- Application Flow Control

---

## Flow

```text
Program Starts
      ↓
main() Invoked
      ↓
Display App Name
      ↓
Display Version
      ↓
Continue to Processing
```

---

## Sample Output

```text
===== PALINDROME CHECKER APP =====
Version: 1.0
Welcome to the Palindrome Validation System
```

---

# 🔤 UC2 — Hardcoded Palindrome Result

## Goal

Check whether a hardcoded string is a palindrome.

---

## Key Concepts

- String
- String Literal
- if-else
- equals()

---

## Flow

```text
Program Starts
      ↓
Hardcoded String Loaded
      ↓
Palindrome Check
      ↓
Display Result
```

---

## Sample Output

```text
Input : madam
Result: Palindrome
```

---

# 🔄 UC3 — String Reverse Based Palindrome Check

## Goal

Validate palindrome by reversing the string.

---

## Key Concepts

- for loop
- String Immutability
- String Concatenation
- equals()

---

## Flow

```text
Input String
      ↓
Reverse String
      ↓
Compare Original & Reverse
      ↓
Display Result
```

---

## Sample Output

```text
Original : radar
Reversed : radar
Palindrome ✓
```

---

# 🔡 UC4 — Character Array-Based Palindrome Check

## Goal

Use char[] and two-pointer technique for validation.

---

## Key Concepts

- char[]
- Array Indexing
- Two-Pointer Technique
- Time Complexity Optimization

---

## Flow

```text
Convert String → char[]
        ↓
Start Pointer ← → End Pointer
        ↓
Compare Characters
        ↓
Display Result
```

---

## Sample Output

```text
Character Array Validation Successful
Palindrome ✓
```

---

# 📚 UC5 — Stack-Based Palindrome Checker

## Goal

Use Stack to reverse and compare characters.

---

## Key Concepts

- Stack
- Push
- Pop
- LIFO Principle

---

## Flow

```text
Push Characters to Stack
          ↓
Pop Characters
          ↓
Compare with Original
          ↓
Display Result
```

---

## Sample Output

```text
Stack Validation Successful
Palindrome ✓
```

---

# 🔁 UC6 — Queue + Stack Based Palindrome Check

## Goal

Demonstrate FIFO vs LIFO behavior.

---

## Key Concepts

- Queue
- Enqueue
- Dequeue
- Stack vs Queue

---

## Flow

```text
Enqueue Characters
Push Characters to Stack
        ↓
Dequeue vs Pop Comparison
        ↓
Display Result
```

---

## Sample Output

```text
Queue & Stack Comparison Successful
Palindrome ✓
```

---

# 📦 UC7 — Deque-Based Optimized Palindrome Checker

## Goal

Use Deque to compare front and rear characters efficiently.

---

## Key Concepts

- Deque
- Front Access
- Rear Access
- Optimized Memory Usage

---

## Flow

```text
Insert into Deque
      ↓
Remove First & Last
      ↓
Compare
      ↓
Repeat Until Empty
```

---

## Sample Output

```text
Deque Validation Successful
Palindrome ✓
```

---

# 🔗 UC8 — Linked List-Based Palindrome Checker

## Goal

Validate palindrome using singly linked list.

---

## Key Concepts

- Singly Linked List
- Node Traversal
- Fast & Slow Pointer
- In-Place Reversal

---

## Flow

```text
Convert to Linked List
         ↓
Find Middle Node
         ↓
Reverse Second Half
         ↓
Compare Both Halves
```

---

## Sample Output

```text
Linked List Validation Successful
Palindrome ✓
```

---

# ♻️ UC9 — Recursive Palindrome Checker

## Goal

Validate palindrome using recursion.

---

## Key Concepts

- Recursion
- Base Condition
- Call Stack

---

## Flow

```text
Compare Start & End
       ↓
Recursive Call
       ↓
Base Condition Reached
       ↓
Return Result
```

---

## Sample Output

```text
Recursive Validation Successful
Palindrome ✓
```

---

# 🎯 UC10 — Case-Insensitive & Space-Ignored Palindrome

## Goal

Ignore spaces and letter case during validation.

---

## Key Concepts

- String Preprocessing
- Regular Expressions
- Case Normalization

---

## Flow

```text
Normalize String
      ↓
Remove Spaces
      ↓
Convert to Lowercase
      ↓
Apply Palindrome Logic
```

---

## Sample Output

```text
Input : Never Odd Or Even
Normalized : neveroddoreven
Palindrome ✓
```

---

# 🧠 UC11 — Object-Oriented Palindrome Service

## Goal

Encapsulate palindrome logic inside service classes.

---

## Key Concepts

- Encapsulation
- Single Responsibility Principle
- Service Layer Design

---

## Flow

```text
Create PalindromeChecker Object
          ↓
Invoke checkPalindrome()
          ↓
Return Result
```

---

## Sample Output

```text
Palindrome Service Executed Successfully
```

---

# ⚙️ UC12 — Strategy Pattern for Palindrome Algorithms

## Goal

Choose palindrome algorithms dynamically at runtime.

---

## Key Concepts

- Interface
- Polymorphism
- Strategy Pattern

---

## Flow

```text
Select Strategy
      ↓
Inject Algorithm
      ↓
Execute Validation
      ↓
Display Result
```

---

## Example Strategies

```text
StackStrategy
DequeStrategy
RecursiveStrategy
ArrayStrategy
```

---

## Sample Output

```text
Current Strategy : StackStrategy
Palindrome ✓
```

---

# 📊 UC13 — Performance Comparison

## Goal

Compare execution speed of multiple palindrome algorithms.

---

## Key Concepts

- System.nanoTime()
- Algorithm Benchmarking
- Performance Metrics

---

## Flow

```text
Run Algorithms
      ↓
Capture Execution Time
      ↓
Compare Results
      ↓
Display Fastest Algorithm
```

---

## Sample Output

```text
Array Approach   : 1200 ns
Stack Approach   : 1800 ns
Deque Approach   : 900 ns

Fastest: Deque Approach
```

---

# 🧠 Object-Oriented Concepts

---

# 1️⃣ Encapsulation

Private fields protect internal state.

```java
private String input;
private boolean result;
```

---

# 2️⃣ Abstraction

Interfaces hide implementation details.

```java
PalindromeStrategy
PalindromeService
```

---

# 3️⃣ Inheritance

Different strategies extend common behavior.

```text
PalindromeStrategy
 ├── StackStrategy
 ├── DequeStrategy
 ├── RecursiveStrategy
 └── ArrayStrategy
```

---

# 4️⃣ Polymorphism

Dynamic algorithm execution.

```java
PalindromeStrategy strategy = new StackStrategy();
```

---

# 📚 Data Structures Used

| Data Structure | Purpose |
|---|---|
| String | Basic palindrome validation |
| char[] | Character comparison |
| Stack | Reverse-order checking |
| Queue | FIFO comparison |
| Deque | Optimized front/rear comparison |
| Linked List | Pointer-based validation |
| Call Stack | Recursive processing |

---

# 🏗️ Design Patterns Applied

| Pattern | Purpose |
|---|---|
| Strategy Pattern | Dynamic algorithm selection |
| Service Pattern | Encapsulated business logic |
| Factory Pattern | Create palindrome strategies |

---

# 🏛️ Application Architecture

```text
Presentation Layer
       ↓
Palindrome Service Layer
       ↓
Validation Algorithms
       ↓
Data Structures
```

---

# 📁 Project Structure

```text
PalindromeCheckerApp/
│
├── src/
│   ├── strategy/
│   │   ├── PalindromeStrategy.java
│   │   ├── StackStrategy.java
│   │   ├── DequeStrategy.java
│   │   ├── RecursiveStrategy.java
│   │   └── ArrayStrategy.java
│   │
│   ├── service/
│   │   ├── PalindromeService.java
│   │   └── PerformanceService.java
│   │
│   ├── model/
│   │   └── ValidationResult.java
│   │
│   ├── util/
│   │   ├── StringUtil.java
│   │   └── InputValidator.java
│   │
│   ├── ds/
│   │   ├── StackChecker.java
│   │   ├── QueueChecker.java
│   │   ├── DequeChecker.java
│   │   └── LinkedListChecker.java
│   │
│   └── main/
│       └── Main.java
│
├── output/
│   └── performance_results.txt
│
├── README.md
└── requirements.txt
```

---

# 💻 Tech Stack

| Technology | Purpose |
|---|---|
| ☕ Java | Core application development |
| 📚 Stack | LIFO palindrome validation |
| 🔁 Queue | FIFO comparison |
| 📦 Deque | Optimized checking |
| 🔗 Linked List | Pointer-based validation |
| ⚡ Recursion | Recursive algorithm implementation |
| 📊 nanoTime() | Performance benchmarking |

---

# 🚀 Getting Started

---

# Prerequisites

```bash
Java 17+
IDE (IntelliJ / Eclipse / VS Code)
```

---

# Compile Project

```bash
javac Main.java
```

---

# Run Application

```bash
java Main
```

---

# 🖥️ Sample Console Flow

```text
===== PALINDROME CHECKER APP =====

1. String Reverse Check
2. Stack-Based Check
3. Queue + Stack Check
4. Deque-Based Check
5. Recursive Check
6. Performance Comparison
7. Exit

Enter Choice:
```

---

# 📊 Performance Comparison

| Algorithm | Time Complexity | Space Complexity |
|---|---|---|
| String Reverse | O(n) | O(n) |
| Character Array | O(n) | O(1) |
| Stack-Based | O(n) | O(n) |
| Queue + Stack | O(n) | O(n) |
| Deque-Based | O(n) | O(1) |
| Recursive | O(n) | O(n) |

---

# ⚙️ Non-Functional Requirements

---

# 🚀 Performance

- Efficient palindrome validation
- Optimized memory usage
- Fast execution for large strings

---

# 🛡️ Reliability

- Accurate palindrome detection
- Stable execution under invalid input

---

# 📈 Scalability

- Easily extendable algorithms
- Plug-and-play strategy implementation

---

# 🧹 Maintainability

- Modular service design
- Clear separation of concerns
- Reusable validation logic

---

# 🔒 Security

- Input sanitization
- Safe string handling
- Protection from invalid processing

---

# ♻️ Recoverability

- Graceful error handling
- Safe recovery from invalid input

---

# 🎯 Educational Goals

| Module | Learning Outcome |
|---|---|
| Core Java | Syntax, loops, conditions |
| Data Structures | Stack, Queue, Deque, Linked List |
| OOP | Encapsulation, abstraction, polymorphism |
| Algorithms | Efficient palindrome validation |
| Recursion | Recursive problem solving |
| Design Patterns | Strategy Pattern |
| Performance | Algorithm benchmarking |

---

# 🔮 Future Enhancements

- GUI using JavaFX or Swing
- Web-based palindrome checker
- Unicode palindrome support
- Multi-language processing
- AI-based string analysis
- Visualization of algorithms
- REST API integration
- Database storage of results

---

# 📜 License

This project is created for educational and learning purposes.

---

> 🔄 *"A palindrome is more than symmetry — it is a perfect demonstration of logic, structure, and algorithmic thinking."*

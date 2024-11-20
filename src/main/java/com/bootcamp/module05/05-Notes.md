# Module 05: Arrays, Loops, and Scanner
*Date: 2024-11-20*

---

## 📝 Key Concepts
## Introduction to Arrays
  - Arrays store multiple values of the same data type.
  - Declared with a fixed size and cannot be resized.
  - Example:
    ```java
    int[] numbers = new int[10];
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = i + 1;
        System.out.println(numbers[i]);
    }
    ```

## Loops
### For Loop
- Best for iterating when the number of iterations is known.
- Example:
  ```java
  for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
  }
  ```

### For-Each Loop
- Simplifies iteration through arrays and collections.
- Example:
  ```java
  for (int number : numbers) {
      System.out.println(number);
  }
  ```

### Scanner Class
  - Used for user input during program execution.
  - Methods include:
    - `nextLine()`: Reads a full line of input.
    - `nextInt()`: Reads an integer.
    - `nextDouble()`: Reads a double.
  - Example:
    ```java
    import java.util.Scanner;

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Hello, " + name);
    
    sc.close();
    ```

---

## 🔑 Nice to Know / Tips
- Practice small exercises regularly to improve syntax knowledge.
- Focus on understanding error messages—they guide you toward solutions.
- Write comments in your code to clarify your thought process.
- Break problems into smaller parts to make them more manageable.

---

## ❓ Questions & Confusions
1. Why does Java require the `main` method for every program to run?
2. How can I debug an error when my array has incorrect values?
3. When should I use a `for` loop instead of a `for-each` loop?

---

## ⚡ Code Examples

### Sum of Array Elements
```java
int[] nums = {1, 2, 3, 4, 5};
int sum = 0;
for (int num : nums) {
    sum += num; // Add each element to sum
}
System.out.println("Sum: " + sum);
```

### Find Largest Element in an Array
```java
int[] values = {1, 5, 3, 9, 2};
int largest = values[0];
for (int value : values) {
    if (value > largest) {
        largest = value;
    }
}
System.out.println("Largest number: " + largest);
```

### Split and Print User Input
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Enter text: ");
String input = scanner.nextLine();
for (char ch : input.toCharArray()) {
        System.out.println(ch); // Print each character
}
        scanner.close();
```


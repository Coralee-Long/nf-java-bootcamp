# Module 02: Java Basics
*Date: 2024-11-18*

---

## 📝 Key Concepts
- **The Main Method**:
    - Entry point for Java programs where execution starts.
    - Written as:
    ```java
    public static void main(String[] args) {
        // Code execution begins here
    }
    ```  

- **Variables**:
    - Containers for storing data.
    - Declaration syntax: `<data_type> <variable_name>;`
    - Example:
    ```java
    int age = 25;  
    double price = 19.99;  
    ```  

- **Data Types**:
    - Primitive: `int`, `double`, `boolean`, `char`, etc.
    - Complex: `String` for text data.

- **Basic Operators**:
    - Arithmetic: `+`, `-`, `*`, `/`.
    - Comparison: `==`, `!=`, `<`, `>`.
    - Logical: `&&`, `||`, `!`.

---

## 🔑 Nice to Know / Tips
- Variables need to be declared before use.
- Strings are objects in Java and are not a primitive type.
- Integer division truncates the result (e.g., `5/2` gives `2`).
- Comments can explain code:
    - Single-line: `//`
    - Multi-line: `/* */`

---

## ❓ Questions & Confusions
1. Why is `String` not a primitive data type?
2. What happens if we forget to initialize a variable?
3. How is `boolean` data type commonly used in conditional logic?

---

## ⚡ Code Examples
```java
// Example: Declaring and using variables
public class JavaBasics {
    public static void main(String[] args) {
        int age = 30;
        double salary = 45000.50;
        boolean isActive = true;
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Is Active: " + isActive);
    }
}

# Module 03: If-Else and Methods
*Date: 2024-11-19*

---

## 📝 Key Concepts
- **Conditional Statements (if, else, else-if)**:
    - Execute different code paths based on conditions.
    - Use `if` for single conditions, `else` for alternatives, and `else-if` for multiple conditions.
    - Example:
    ```java
    int score = 85;

    if (score >= 90) {
        System.out.println("Excellent!");
    } else if (score >= 80) {
        System.out.println("Good job!");
    } else {
        System.out.println("Keep practicing.");
    }
    ```  

- **Methods**:
    - Modularize code for readability and reusability.
    - Defined with a header specifying name, parameters, and return type.
    - Example:
    ```java
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    ```  

- **Parameters vs. Arguments**:
    - Parameters are placeholders in the method signature.
    - Arguments are the actual values passed when calling the method.
    - Example:
    ```java
    greetUser("Alice");  // "Alice" is the argument
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
    ```  

- **The return Statement**:
    - Used to send a value back to the calling method.
    - Example:
    ```java
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    ```  

---

## 🔑 Nice to Know / Tips
- Use `else-if` for more complex decision-making.
- Always ensure a method has a clear return type or `void` for no return.
- Place reusable logic in methods to avoid code duplication.
- Write comments above methods to explain their purpose.

---

## ❓ Questions & Confusions
1. What happens if a method’s return type is declared but no `return` statement is provided?
2. How does Java handle multiple `else-if` conditions that are all true? Does it stop at the first match?
3. Can we have a method without parameters and still return a value?

---

## ⚡ Code Examples
```java
// Example: Using conditional statements and methods
public class Module03Example {
    public static void main(String[] args) {
        int score = 75;
        System.out.println(getGrade(score));
    }

    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "F";
        }
    }
}

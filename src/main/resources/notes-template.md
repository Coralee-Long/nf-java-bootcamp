# Module 01: Topic Name
### Date: 2024-xx-xx

---

## 📝 Key Concepts
- **Java Basics**: Variables, data types, `System.out.println()`.
- **Method Declaration**: Syntax and return types.
- **Packages**: Used for organizing files.

---

## ⚡ Code Examples
```java
// Print "Hello, World!" to the console
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
---

## 📌 Key Notes / Takeaways
- **Java is strongly typed**: Variables must have a defined type.
- **`System.out.println`**: Used to print output to the console.
- **Structure of a Java Program**:
    - `public class ClassName`: Declares a class.
    - `public static void main(String[] args)`: Entry point for the program.
- **Packages**: Used to organize files and avoid conflicts in large projects.
- **Methods**: Encapsulate code to be reused and maintain readability.
- **Comments**: Use `//` for single-line and `/* */` for multi-line comments.
- **Best Practices**:
    - Use descriptive names for classes, variables, and methods.
    - Keep your code organized with packages and meaningful structure.

---

## 💡 Nice to Know / Tips
- **Semicolons**: Every statement in Java ends with a semicolon (`;`).
- **Case Sensitivity**: Java is case-sensitive, so `Main` and `main` are different.
- **Naming Conventions**:
    - Class names: `PascalCase` (e.g., `MyClass`).
    - Methods and variables: `camelCase` (e.g., `myVariable`, `printMessage`).
- **`main` Method**: Always required as the entry point for execution.
- **IDE Shortcuts**:
    - Use `Ctrl + /` (or `Cmd + /` on Mac) to toggle single-line comments.
    - Use `Alt + Insert` (or `Cmd + N`) to quickly generate code (e.g., constructors, getters/setters).
- **Debugging**:
    - Use `System.out.println()` to track variable values and code flow.
    - Step through code using the IDE's debugger for better understanding.
- **Compile vs Run**: Always compile your code (e.g., `javac`) before running it (`java`).

---

## ❓ Questions & Confusions
1. **Method Overloading**:
    - How do multiple methods with the same name but different parameters work in practice?
    - When should I use it effectively?

2. **Packages and Imports**:
    - Why do we need to specify the package name at the top of each file?
    - What happens if we don’t use `package` declarations?

3. **Static vs Non-Static Methods**:
    - When should I declare a method as `static`?
    - What are the limitations of static methods?

4. **IDE Warnings**:
    - What does “method does the same thing” mean?
    - Is there a way to resolve or ignore these warnings?

5. **General**:
    - How do I structure larger projects effectively in Java?
    - When and why should I separate logic into different classes?

---
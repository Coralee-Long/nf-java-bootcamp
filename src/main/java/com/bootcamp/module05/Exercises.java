package com.bootcamp.module05;

import java.util.Scanner;

public class Exercises {
    public static void solveExercises() {
        /**
         * Create a new Java project and implement the following steps:
         *
         * Step 1: Create an array with numbers from 1 to 10 and print it to the console.
         *
         * Step 2: Calculate the sum of all numbers in the array and print the result to the console.
         *
         * Step 3: Find the largest number in the array and print it to the console.
         *
         * Step 4: Create a second array with numbers from 11 to 20.
         *
         * Step 5: Perform element-wise addition of both arrays and store the result in a third array.
         *         Print the result array to the console.
         */

        // Step 1: Create an array with numbers from 1 to 10
        System.out.println("\nStep 1: Create an array with numbers from 1 to 10 and print");
        int[] ten = new int[10]; // Array to store numbers 1 to 10
        for (int i = 0; i < 10; i++) {
            ten[i] = i + 1; // Assign values starting from 1
            System.out.println(ten[i]); // Print each value
        }

        // Step 2: Calculate the sum of all numbers in the array
        System.out.println("\nStep 2: Calculate the sum of all numbers.");
        int sum = 0; // Initialize the sum variable
        for (int i = 0; i < ten.length; i++) {
            sum += ten[i]; // Add each number to the sum
        }
        System.out.println("Sum: " + sum); // Print the total sum

        // Step 3: Find the largest number in the array
        System.out.println("\nStep 3: Find the largest number in the array.");
        int largest = ten[0]; // Assume the first number is the largest initially
        for (int number : ten) { // Loop through all numbers
            if (number > largest) { // If a larger number is found
                largest = number; // Update the largest number
            }
        }
        System.out.println("Largest number: " + largest); // Print the largest number

        // Step 4: Create a second array with numbers from 11 to 20
        System.out.println("\nStep 4: Create a second array with numbers from 11 to 20.");
        int[] twenty = new int[10]; // Array to store numbers 11 to 20
        for (int i = 0; i < 10; i++) {
            twenty[i] = i + 11; // Assign values starting from 11
            System.out.println(twenty[i] + " "); // Print each value
        }

        // Step 5: Perform element-wise addition of both arrays
        System.out.println("\nStep 5: Perform element-wise addition of both arrays.");
        int[] eAddition = new int[10]; // Array to store the results
        for (int i = 0; i < eAddition.length; i++) { // Fixed loop condition to iterate correctly
            eAddition[i] = ten[i] + twenty[i]; // Add corresponding elements from both arrays
            System.out.println("Element " + i + ": " + eAddition[i]); // Print the sum at each index
        }
    }

    // Bonus: Implement a program that reads a text from the console and then outputs the letters individually
    public static void splitInput() {
        System.out.println("\nBonus: Implement a program that reads a text from the console and then outputs the letters individually.");

        // Step 1: Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text: "); // Prompt the user

        // Step 2: Read the entire line of input
        String input = scanner.nextLine();

        // Step 3: Split the input into characters and print each one
        System.out.println("Individual letters: ");
        for (char letter : input.toCharArray()) { // Convert input string to char array
            System.out.println(letter); // Print each character

            // Close the scanner (avoids resource leaks)
            scanner.close();
        }
    }
}

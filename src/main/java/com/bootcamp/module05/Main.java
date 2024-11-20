package com.bootcamp.module05;

import com.bootcamp.module05.Exercises;
import com.bootcamp.module05.Lecture;

public class Main {
    public static void main(String[] args) {
        // Running lecture snippets

        System.out.println("Running Lecture Examples:");
        Lecture.runLecture();

        // Running exercises
        System.out.println("\nRunning Exercises:");
        com.bootcamp.module05.Exercises.solveExercises();
        System.out.println("\nRunning Bonus Exercise:");
        com.bootcamp.module05.Exercises.splitInput();

        System.out.println("\nTesting various utility methods:");
        Exercises.testMethods.sum(10,10);
        Exercises.testMethods.isEven(3);
        Exercises.testMethods.product(2,25);
        Exercises.testMethods.toUpperCase("here is some lower case text");
        Exercises.testMethods.isPositive(123456);
    }



}

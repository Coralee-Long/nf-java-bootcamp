package com.bootcamp.module05;

import com.bootcamp.module01.Exercises;
import com.bootcamp.module01.Lecture;

public class Main {
    public static void main(String[] args) {
        // Running lecture snippets
        System.out.println("Running Lecture Examples:");
        Lecture.runLecture();

        // Running exercises
        System.out.println("\nRunning Exercises:");
        com.bootcamp.module01.Exercises.solveExercise1();
        Exercises.solveExercise2();
    }
}

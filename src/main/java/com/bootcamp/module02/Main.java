package com.bootcamp.module02;

import com.bootcamp.module02.Exercises;
import com.bootcamp.module02.Lecture;

public class Main {
    public static void main(String[] args) {
        // Running lecture snippets
        System.out.println("Running Lecture Examples:");
        Lecture.runLecture();

        // Running exercises
        System.out.println("\nRunning Exercises:");
        com.bootcamp.module02.Exercises.solveExercise1();
        Exercises.solveExercise2();
    }
}
package com.bootcamp.module04;

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

    }
}

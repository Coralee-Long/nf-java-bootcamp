package com.bootcamp.module05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    // test that calculates the sum of two integers
    @Test
    void sumOfIntegers() {
        // GIVEN
        int a = 10;
        int b = 10;
        int expectedSum = 20;
        // WHEN
        int actualSum = Exercises.testMethods.sum(a, b);
        // THEN
        Assertions.assertEquals(expectedSum, actualSum);
    }

    // Write a test for a method that checks if a given number is even
    @Test
    void isEven_false_77() {
        // GIVEN
        int number = 77;
        boolean expectedResult = false;
        // WHEN
        boolean actualResult = Exercises.testMethods.isEven(number);
        // THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Write a test for a method that calculates the product of 2 numbers
    @Test
    void productOfTwoInters() {
        // GIVEN
        int c = 2;
        int d = 25;
        int expectedResult = 50;
        // WHEN
        int actualResult = Exercises.testMethods.product(c,d);
        //THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

    // Write a test for a method that converts a given string to uppercase
    @Test
    void convertStringToUpperCase() {
        // GIVEN
        String text = "here is some lower case text";
        String expectedResult = "HERE IS SOME LOWER CASE TEXT";
        // WHEN
        String actualResult = Exercises.testMethods.toUpperCase(text);
        // THEN
        Assertions.assertEquals(expectedResult, actualResult);

    }

    // Write a test for a method that checks if a given number is positive
    @Test
    void checkIfIntPositive() {
        // GIVEN
        int number = 123456;
        boolean expectedResult = true;
        // WHEN
        boolean actualResult = Exercises.testMethods.isPositive(number);
        // THEN
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
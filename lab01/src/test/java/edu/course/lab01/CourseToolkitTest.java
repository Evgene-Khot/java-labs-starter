package edu.course.lab01;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void Test_2_ForPrimeNumber() {
        boolean result = CourseToolkit.isPrime(2);

        assertTrue(result);
    }

    @Test
    void Test_49_ForPrimeNumber() {
        boolean result = CourseToolkit.isPrime(49);

        assertFalse(result);
    }

    @Test
    void Test_12_ForPrimeNumber() {
        boolean result = CourseToolkit.isPrime(12);

        assertFalse(result);
    }

    @Test
    void Test_1_ForPrimeNumber() {
        boolean result = CourseToolkit.isPrime(1);

        assertFalse(result);
    }

    @Test
    void Test_hello_ForPalindrome() {
        boolean result = CourseToolkit.isPalindrome("hello");

        assertFalse(result);
    }

    @Test
    void Test_level_ForPalindrome() {
        boolean result = CourseToolkit.isPalindrome("level");

        assertTrue(result);
    }

    @Test
    void Test__ForPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> {
                CourseToolkit.isPalindrome(null);
        });
    }
}

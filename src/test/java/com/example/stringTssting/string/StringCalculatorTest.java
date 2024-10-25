package com.example.stringTssting.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {


    @Test
    public void testEmptyStringReturnsZero() {
        assertEquals(15, StringCalculator.add("10,5"));
    }




    @Test
    public void testSingleNumberReturnsThatNumber() {
        assertEquals(5, StringCalculator.add("5"));
    }
}
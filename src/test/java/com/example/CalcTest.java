package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {
    Calc calculator = new Calc();

    @Test
    void testDivide() {
        double execute = calculator.divide(5, 5);
        
        assertEquals(1, execute);
    }

    @Test
    void testMultiply() {
        int execute = calculator.multiply(5, 5);

        assertEquals(25, execute);
    }

    @Test
    void testSubtract() {
        int execute = calculator.subtract(15, 5);

        assertEquals(10, execute);
    }

    @Test
    void testSum() {
        int execute = calculator.sum(5, 5);

        assertEquals(10, execute);
    }
}

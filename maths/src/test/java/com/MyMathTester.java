package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MyMathTester {

    @Test
    void testInvalidSqrtOfNegativeNumber() {
        assertThrows(ArithmeticException.class, () -> {
            final double delta = 1e-8;
            MyMath.root(-1, 2, delta);
        });
    }

    @Test
    void testSqrtOfOne() {
        final double delta = 1e-8;
        final double expected = Math.sqrt(1);
        final double actual = MyMath.root(1, 2, delta);

        assertEquals(expected, actual, delta);
    }

    @Test
    void testSqrtOfTwo() {
        final double delta = 1e-8;
        final double expected = Math.sqrt(2);
        final double actual = MyMath.root(2, 2, delta);

        assertEquals(expected, actual, delta);
    }

    @Test
    void testRoot3OfNeg8() {
        final double delta = 1e-8;
        final double expected = -2;
        final double actual = MyMath.root(-8, 3, delta);

        assertEquals(expected, actual, delta);
    }

}

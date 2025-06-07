package com;

public class MyMath {

    public static double root(double value, double base, double delta) {
        if (value < 0 && base % 2 == 0) {
            String message = "Attempt to calculate the even root "
                    + base + " of the negative number " + value
                    + ". There are no even roots of negative numbers.";

            throw new ArithmeticException(message);
        }

        double bot = Math.min(value, -value);
        double top = Math.max(value, -value);
        double mid = 0;

        for (;;) {
            mid = (bot + top) / 2;
            double candidate = Math.pow(mid, base);
            double error = Math.abs(candidate - value);

            if (error <= delta) {
                return mid;
            }

            if (candidate > value) {
                top = mid;

            } else {
                bot = mid;
            }
        }
    }
}

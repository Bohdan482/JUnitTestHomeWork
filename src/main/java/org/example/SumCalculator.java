package org.example;

public class SumCalculator {
    public int sum(int n) {
        int result;
        if (n > 0) {
            result = n * (n + 1) / 2;
        } else
            throw new IllegalArgumentException();
        return result;
    }
}

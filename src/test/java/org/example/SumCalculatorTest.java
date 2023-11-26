package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void setUp(){
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumWhenNumberIsOne(){
        int actualSum = sumCalculator.sum(1);
        Assertions.assertEquals(1, actualSum);
    }

    @Test
    void sumWhenNumberIsThree(){
        int actualSum = sumCalculator.sum(3);
        Assertions.assertEquals(6, actualSum);
    }

    @Test
    void sumWhenNumberIsZero(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> sumCalculator.sum(0));
    }
}

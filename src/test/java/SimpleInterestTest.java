package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleInterestTest {

    @Test
    public void testSimpleInterest() {
        SimpleInterest obj = new SimpleInterest();
        assertEquals(100.0, obj.calculate(1000, 5, 2), 0.001);
    }

    @Test
    public void testZeroRate() {
        SimpleInterest obj = new SimpleInterest();
        assertEquals(0.0, obj.calculate(1000, 0, 2), 0.001);
    }
}
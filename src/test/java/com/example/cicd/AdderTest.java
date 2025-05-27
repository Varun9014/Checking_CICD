package com.example.cicd;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdderTest {

    @Test
    public void testAddThreeNumbers() {
        Adder adder = new Adder();
        int result = adder.addThreeNumbers(2, 3, 5);
        assertEquals(10, result);  // Should be 10
    }
}

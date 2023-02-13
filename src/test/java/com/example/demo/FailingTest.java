package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FailingTest {

    @Test
    public void someFailingTest() {
        assertTrue(false);
    }
}

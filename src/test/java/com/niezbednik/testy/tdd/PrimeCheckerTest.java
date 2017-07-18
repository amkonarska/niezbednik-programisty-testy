package com.niezbednik.testy.tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PrimeCheckerTest {
    @Test
    public void shouldReturnTrueForTwo() {
        PrimeChecker checker = new PrimeChecker();

        assertTrue(checker.isPrime(2));
    }

    @Test
    public void shouldReturnTrueForOddNumberSquare() {
        PrimeChecker checker = new PrimeChecker();

        assertTrue(checker.isPrime(9));
    }
}
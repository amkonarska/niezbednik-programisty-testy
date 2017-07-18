package com.niezbednik.testy.tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PrimeCheckerTest {
    // Nie działa dla 2 - dodajemy test, który odtwarza błąd
    @Test
    public void shouldReturnTrueForTwo() {
        PrimeChecker checker = new PrimeChecker();

        assertTrue(checker.isPrime(2));
    }
}
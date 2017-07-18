package com.niezbednik.testy.tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PrimeCheckerTest {
    @Test
    public void shouldReturnTrueForTwo() {
        PrimeChecker checker = new PrimeChecker();

        assertTrue(checker.isPrime(2));
    }

    // Nie działa dla 9 - dodajemy test, który odtwarza błąd
    @Test
    public void shouldReturnTrueForNine() {
        PrimeChecker checker = new PrimeChecker();

        assertTrue(checker.isPrime(9));
    }
}
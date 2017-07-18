package com.niezbednik.testy.tdd;

class PrimeChecker {
    boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        // oglądamy kod chcąc go zrefaktorować - widzimy, że problem dotyczy
        // wszystkich kwadratów liczb nieparzystych
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

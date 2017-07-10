package com.niezbednik.testy.basic;

import java.util.List;

class Calculator {

    private static final int THOUSAND = 1_000;
    private static final int MILLION = 1_000_000;

    int add(int a, int b) { //assertEquals
        return a + b;
    }

    int divide(int a, int b) { //expectedException
        return a / b;
    }

    int sumList(List<Integer> values) {
        int sum = 0;
        for (Integer value : values) {
            sum += value;
        }
        return sum;
    }

    boolean isEven(int a) { //assertTrue, assertFalse
        return a % 2 == 0;
    }

    /**
     * Takes an int and prints it in proper format, replacing all millions with M letter and
     * thousands with K letter.
     */
    String format(int a) {
        StringBuilder sb = new StringBuilder();

        if (a < 0) {
            a *= -1;
            sb.append("-");
        }

        if (a >= MILLION) {
            int millions = a / MILLION;
            a = a % MILLION;
            sb.append(millions).append("M");

            if (a > 0) {
                sb.append(" ");
            }
        }

        if (a >= THOUSAND) {
            int thousands = a / THOUSAND;
            a = a % THOUSAND;
            sb.append(thousands).append("K");

            if (a > 0) {
                sb.append(" ");
            }
        }

        if (a > 0) {
            sb.append(a);
        }

        return sb.toString();
    }
}

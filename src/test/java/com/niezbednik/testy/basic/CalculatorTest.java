package com.niezbednik.testy.basic;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    @Test
    public void shouldAddIntegers() {
        Calculator calculator = new Calculator();

        int sum = calculator.add(1, 2);

        assertThat(sum).isEqualTo(3);
        // to samo można zapisać używając wbudowanych assercji TestNG jako:
        // assertEquals(sum, 3);
    }

    @Test
    public void shouldDivideIntegers() {
        Calculator calculator = new Calculator();

        int divisionResult = calculator.divide(4, 2);

        assertThat(divisionResult).isEqualTo(2);
    }
}
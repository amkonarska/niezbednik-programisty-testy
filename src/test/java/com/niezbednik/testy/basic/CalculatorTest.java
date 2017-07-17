package com.niezbednik.testy.basic;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.testng.Assert.assertTrue;

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

    @Test(expectedExceptions = ArithmeticException.class)
    public void shouldThrowArithmeticExceptionWhenDivingByZero() {
        Calculator calculator = new Calculator();

        calculator.divide(4, 0);
    }

    @Test
    public void shouldReturnZeroForEmptyList() {
        Calculator calculator = new Calculator();

        int sum = calculator.sumList(Collections.emptyList());

        assertThat(sum).isEqualTo(0);
    }

    @Test
    public void shouldSumListOfElements() {
        Calculator calculator = new Calculator();
        List<Integer> values = Arrays.asList(1, 2, 3);

        int sum = calculator.sumList(values);

        assertThat(sum).isEqualTo(6);
    }

    @Test
    public void shouldThrowExceptionWhenListIsNull() {
        Calculator calculator = new Calculator();

        assertThatThrownBy(() -> calculator.sumList(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessage("SumList require non null argument.");
    }

    @Test
    public void shouldReturnTrueForEvenNumber() {
        Calculator calculator = new Calculator();

        assertTrue(calculator.isEven(2));
    }
}
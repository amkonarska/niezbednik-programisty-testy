package com.niezbednik.testy.basic;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeMethod
    public void initializeCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void shouldAddIntegers() {
        int sum = calculator.add(1, 2);

        assertThat(sum).isEqualTo(3);
        // to samo można zapisać używając wbudowanych assercji TestNG jako:
        // assertEquals(sum, 3);
    }

    @Test
    public void shouldDivideIntegers() {
        int divisionResult = calculator.divide(4, 2);

        assertThat(divisionResult).isEqualTo(2);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void shouldThrowArithmeticExceptionWhenDivingByZero() {
        calculator.divide(4, 0);
    }

    @Test
    public void shouldReturnZeroForEmptyList() {
        int sum = calculator.sumList(Collections.emptyList());

        assertThat(sum).isEqualTo(0);
    }

    @Test
    public void shouldSumListOfElements() {
        List<Integer> values = Arrays.asList(1, 2, 3);

        int sum = calculator.sumList(values);

        assertThat(sum).isEqualTo(6);
    }

    @Test
    public void shouldThrowExceptionWhenListIsNull() {
        assertThatThrownBy(() -> calculator.sumList(null))
                .isInstanceOf(NullPointerException.class)
                .hasMessage("SumList require non null argument.");
    }

    @Test
    public void shouldReturnTrueForEvenNumber() {
        assertTrue(calculator.isEven(2));
    }

    @Test
    public void shouldReturnFalseForEvenNumber() {
        assertFalse(calculator.isEven(1));
    }

    @DataProvider
    public Object[][] numbersDataProvider() {
        return new Object[][]{
                {1, "1"},
                {-1, "-1"},
                {123, "123"},
                {1_234, "1K 234"},
                {1_234_567, "1M 234K 567"},
        };
    }

    @Test(dataProvider = "numbersDataProvider")
    public void shouldFormatString(int input, String expectedResult) {
        String formattedString = calculator.format(input);

        assertThat(formattedString).isEqualTo(expectedResult);
    }
}
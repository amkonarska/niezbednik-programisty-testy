package com.niezbednik.testy.tdd;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringSumTest {
// Napisz prostą klasę StringSum, która będzie miała jedną metodę o sygnaturze:
// String sum(String number1, String number2)
// która będzie akceptowała na wejściu jedynie liczby naturalne i będzie zwracała ich sumę. Jeśli liczba na wejściu
// nie będzie liczbą naturalną należy zastąpić ją przez 0 (zero).
//
// 1. Zacznij z najprostszym testem dla pustego Stringa
// 2. Stwórz prostą metodę o podanej sygnaturze
// 3. Napisz test, który będzie testował działanie dla dwóch małych liczb
// 4. Zaimplementuj kod aby test przechodził
// 5. Jeśli test przeszedł - zrefaktoruj kod

    @Test
    public void shouldReturnZeroForEmptyString() {
        StringSum sumator = new StringSum();

        String sum = sumator.sum("", "");

        assertThat(sum).isEqualTo("0");
    }

    @Test
    public void shouldSumTwoSmallNaturalNumbers() {
        StringSum sumator = new StringSum();

        String sum = sumator.sum("1", "2");

        assertThat(sum).isEqualTo("3");
    }

    @Test
    public void shouldReturnZeroWhenSummingTwoNotNaturalNumbers() {
        StringSum sumator = new StringSum();

        String sum = sumator.sum("1.1", "2.2");

        assertThat(sum).isEqualTo("0");
    }
}

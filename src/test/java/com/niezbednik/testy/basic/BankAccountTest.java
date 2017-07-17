package com.niezbednik.testy.basic;

import org.assertj.core.data.Offset;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BankAccountTest {

    @Test
    public void shouldDecreaseBalanceWhenWithdrawing() {
        BankAccount bankAccount = new BankAccount(10.0);

        bankAccount.withdraw(1.88);

        assertThat(bankAccount.getBalance()).isEqualTo(8.12, Offset.offset(0.1));
        // to samo można zapisać używając wbudowanych assercji TestNG jako:
        // assertEquals(bankAccount.getBalance(), 8.12, 0.1);
    }
}
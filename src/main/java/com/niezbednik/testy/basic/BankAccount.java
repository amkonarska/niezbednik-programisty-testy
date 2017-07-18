package com.niezbednik.testy.basic;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class BankAccount {
    private final List<Transaction> history = new ArrayList<>();
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void withdraw(double amount) {
        Preconditions.checkState(amount < balance, "Cannot withdraw money - insufficient funds");

        balance -= amount;
        history.add(new Transaction(TransactionType.WITHDRAWAL, amount));
    }

    void deposit(double amount) {
        balance += amount;
        history.add(new Transaction(TransactionType.DEPOSIT, amount));
    }

    List<Transaction> getHistory() {
        return Collections.unmodifiableList(history);
    }

    static class Transaction {
        final TransactionType transactionType;
        final double amount;


        Transaction(TransactionType transactionType, double amount) {
            this.transactionType = transactionType;
            this.amount = amount;
        }

        // Pamiętajcie - equals zawsze idzie w parze z hashCode!
        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Transaction that = (Transaction) o;
            return Double.compare(that.amount, amount) == 0 &&
                    transactionType == that.transactionType;
        }

        @Override
        public int hashCode() {
            return Objects.hash(transactionType, amount);
        }
    }

    enum TransactionType {
        WITHDRAWAL, DEPOSIT
    }
}

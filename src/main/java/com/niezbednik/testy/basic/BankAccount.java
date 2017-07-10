package com.niezbednik.testy.basic;

import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    class Transaction {
        final TransactionType transactionType;
        final double amount;


        Transaction(TransactionType transactionType, double amount) {
            this.transactionType = transactionType;
            this.amount = amount;
        }
    }

    enum TransactionType {
        WITHDRAWAL, DEPOSIT
    }
}

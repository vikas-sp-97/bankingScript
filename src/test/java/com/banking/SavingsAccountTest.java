package com.banking;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.sql.Date;


class SavingsAccountTest {

    private final SavingsAccount sc = new SavingsAccount(12345, "Mark", Date.valueOf("2000-12-12"));

    @ParameterizedTest
    @ValueSource(doubles = {100, 500, 700})
    void depositAmount(double amount) {
        double oldBalance = sc.getBalance();
        // double amount = 1000;
        sc.depositAmount(amount);

        double newBalance = sc.getBalance();

        assert newBalance == oldBalance + amount;
    }

    @Test
    void checkBalance() {
    }

    @Test
    void withdrawAmount() {
        double depositAmount = 1000;
        double withdrawAmount = 200;

        sc.depositAmount(depositAmount);

        double oldBalance = sc.getBalance();
        sc.withdrawAmount(withdrawAmount);

        double newBalance = sc.getBalance();

        assert newBalance == oldBalance - withdrawAmount;
    }

    @Test
    void testToString() {
    }
}
package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountingTest {
    @Test
    public void testNumberMonthsRest() {
        Accounting accounting = new Accounting();

        int actual = accounting.calculate(10000, 3000, 20000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumberMonthsinRest() {
        Accounting accounting = new Accounting();

        int actual = accounting.calculate(100000, 60000, 150000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}
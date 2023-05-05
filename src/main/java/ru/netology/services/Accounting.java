package ru.netology.services;

public class Accounting {
    public int calculate(int income, int expenses, int threshold) {
        int counter = 0;
        int wallet = 0;
        for (int i = 0; i < 12; i++) {
            if (wallet >= threshold) {
                counter++;
                wallet = wallet - expenses;
                wallet = wallet / 3;
            } else {
                wallet = wallet + income - expenses;
            }
        }
        return counter;
    }

}

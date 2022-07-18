
package ru.netology.sqr.services;

public class SQRService {
    public int amountNumbersWithinBoundaries(int Lower, int Upper) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {

            if (i * i >= Lower && i * i <= Upper) {
                amount++;
            }
        }
        return amount;
    }

}
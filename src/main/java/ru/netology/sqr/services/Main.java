package ru.netology.sqr.services;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.amountNumbersWithinBoundaries(200, 300));
    }
}

package ru.netology.sqr.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/scope.csv")
    public void testSqrNumbersInsideBoundaries(int expected, int Lower, int Upper) {
        SQRService service = new SQRService();

        int actual = service.amountNumbersWithinBoundaries(Lower, Upper);

        Assertions.assertEquals(expected, actual);
    }
}
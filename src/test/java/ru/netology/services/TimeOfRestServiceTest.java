package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class TimeOfRestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/TimeOfRestDataset.csv")
    public void testWithValidDate(int income, int expenses, int threshold, int expected) {
        TimeOfRestService service = new TimeOfRestService();

        int actual = service.calcTimeOfRest(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}

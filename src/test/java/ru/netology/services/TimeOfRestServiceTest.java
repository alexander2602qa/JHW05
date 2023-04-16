package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeOfRestServiceTest {

    @Test
    public void testWithValidDate1() {
        TimeOfRestService service = new TimeOfRestService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calcTimeOfRest(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWithValidDate2() {
        TimeOfRestService service = new TimeOfRestService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calcTimeOfRest(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}

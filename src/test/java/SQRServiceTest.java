package ru.netology.sqr.cycleqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void souldCalculate() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void souldCalc() {
        SQRService service = new SQRService();
        int actual = service.calculate(10, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}

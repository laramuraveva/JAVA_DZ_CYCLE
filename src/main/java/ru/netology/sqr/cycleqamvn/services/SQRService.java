package ru.netology.sqr.cycleqamvn.services;

public class SQRService {
    public int calculate(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= min) {
                if (sqr <= max) {
                    count++;

                }
            }
        }
        return count;
    }
}

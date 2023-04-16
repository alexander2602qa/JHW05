package ru.netology.services;

public class TimeOfRestService {

    public int calcTimeOfRest(int income, int expenses, int threshold) {
        double money = 0;
        int monthOfRest = 0;
        for (int i = 1; i <= 12; i++) {
            if (money < threshold) {
                money = money + income - expenses;
            } else {
                money = (money - expenses) / 3;
                monthOfRest++;
            }
        }
        return monthOfRest++;
    }

}

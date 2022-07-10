package com.futurecollars.lesson4.task7;

public class NameOfDay extends Main {

    public static String nameOfDayToString(int dayNum) {
        if (dayNum > 7 || dayNum < 1 ) {
            return "There is no such a day";
        } else {
            DaysOfWeek[] dayName = DaysOfWeek.values();
            dayName[--dayNum].toString();
            return dayName[dayNum].toString();
        }
    }
}

package com.rohan.dp.factory.ex1;

import java.util.Calendar;

public class DemoCalendar {

    public static void main(String[] args) {
        // GregorianCalendar is returned by default
        var gregorianCalendar = Calendar.getInstance();
//        var differentCalendar = Calendar.getInstance(Locale.FRANCE);

        System.out.println(gregorianCalendar);

        System.out.println(gregorianCalendar.get(Calendar.DAY_OF_MONTH));
    }
}

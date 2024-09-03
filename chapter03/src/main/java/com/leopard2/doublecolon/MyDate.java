package com.leopard2.doublecolon;

import java.util.Date;
import java.util.Calendar;
import java.util.Locale;

public class MyDate {
    private String dayName;

    private Date currentDate;

    private Date nextDate;

    public MyDate() {
        super();
        this.currentDate = new Date();
        this.nextDate = getNextDay(currentDate);
        this.dayName = getDayName(currentDate);
    }

    public Date getNextDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        return calendar.getTime();
    }

    public String getDayName(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
    }

    public void printDayName(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        System.out.println( "printDayName : " + calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()) );
    }

    public boolean isWeekend(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
    }

    public static boolean isSunday(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
    }
}

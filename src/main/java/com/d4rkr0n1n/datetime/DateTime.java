package com.d4rkr0n1n.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
  public static void main(String[] args) {
    System.out.println(getFormattedDate());

    LocalDate startLocalDate = LocalDate.now();
    LocalDate endLocalDate = LocalDate.of(2023, Month.DECEMBER, 13);
    
    System.out.println(getWeekDifference(startLocalDate, endLocalDate));
  }

  private static Date getDate() {
    return new Date();
  }

  private static String getFormattedDate() {
    String pattern = "MM-dd-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String date = simpleDateFormat.format(getDate());
    return date;
  }

  private static int getWeekDifference(LocalDate sDate, LocalDate eDate) {
    ZoneId zoneId = ZoneId.systemDefault();
    
    Calendar startDateCalendar = Calendar.getInstance();
    startDateCalendar.setTime(Date.from(sDate.atStartOfDay(zoneId).toInstant()));
    
    Calendar endDateCalendar = Calendar.getInstance();
    endDateCalendar.setTime(Date.from(eDate.atStartOfDay(zoneId).toInstant()));
    
    return endDateCalendar.get(Calendar.WEEK_OF_YEAR) - startDateCalendar.get(Calendar.WEEK_OF_YEAR);
  }
}

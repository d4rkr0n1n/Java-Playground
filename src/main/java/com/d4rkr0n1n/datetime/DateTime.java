package com.d4rkr0n1n.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
  public static void main(String[] args) {
    String pattern = "MM-dd-yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String date = simpleDateFormat.format(getDate());
    System.out.println(date);
  }

  private static Date getDate() {
    return new Date();
  }
}

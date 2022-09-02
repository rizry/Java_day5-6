package com.java.day5;

import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a year to check if its Leap Year ");
    short year = 2000;
    do {
      year = sc.nextShort();
      if ((float) year / 1000 < 1) {
        System.out.print("year must be of four length. Enter again ");
      }
    } while ((float) year / 1000 < 1);
    sc.close();

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
      System.out.println("\nLeap Year");
    } else {
      System.out.println("\nNot a Leap Year");
    }

  }
}

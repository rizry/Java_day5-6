package com.java.day6;

import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to reverse it ");

    long n = sc.nextLong();
    sc.close();

    long revNum = 0;
    while (n > 0) {
      byte r = (byte) (n % 10);
      revNum = revNum * 10 + r;
      n /= 10;
    }

    System.out.printf("reversed number %d", revNum);

  }
}

package com.java.day6;

import java.util.Scanner;

public class CouponNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many distinct numbers do you want? ");

    String couponNumStr = "";
    byte n = 0;

    do {
      n = sc.nextByte();
      if (n < 1 || n > 9) System.out.print("that many numbers cant be distint. Enter again ");
    } while (n < 1 || n > 9);

    sc.close();

    while (n > 0) {
      byte random = (byte) (Math.random() * 10);
      if (!couponNumStr.contains("" + random)) {
        couponNumStr += random;
        n--;
      }
    }

    System.out.print("Your generated coupon number is " + couponNumStr);
  }
}

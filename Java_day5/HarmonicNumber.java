package com.java.day5;

import java.util.Scanner;

public class HarmonicNumber {
  public static void main(String[] args) {
    float harmonicValue = 0;
    short N = 0;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive number ");

    do {
      N = sc.nextShort();
      if (N < 1) {
        System.out.print("Thats not valid. Enter again ");
      }
    } while (N < 1);
    sc.close();

    for (byte i = 1; i <= N; i++) {
      harmonicValue += (float) 1 / i;
    }

    System.out.println("Harmonic Number at " + N + "  " + harmonicValue);
  }
}

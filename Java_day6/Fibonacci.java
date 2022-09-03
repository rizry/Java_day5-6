package com.java.day6;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter how many numbers in series to print ");
    int n = sc.nextInt();
    sc.close();

    int a = 0;
    int b = 1;

    System.out.print(a + ", " + b + ", ");

    for (short i = 3; i <= n; i++) { //starting the for loop from 3 because first two numbers are already printed
      int c = a + b;
      System.out.print(c + ", ");
      a = b;
      b = c;

    }
  }
}

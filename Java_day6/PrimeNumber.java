package com.java.day6;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number upto which to generate primes ");

    int n = sc.nextInt();
    sc.close();

    for (int i = 1; i <= n; i++) {
      boolean isPrime = true;

      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime) System.out.print(i + " ");
    }

  }
}

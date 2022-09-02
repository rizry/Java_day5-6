package com.java.day5;

import java.util.Scanner;

public class Factors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to find prime factors of ");
    int N = sc.nextInt();

    for (short i = 3; i * i <= N; i += 2) {
      while (N % 2 == 0) {
        N = N / 2;
        System.out.print(2 + " ");
      }
      while (N % i == 0) {
        N = N / i;
        System.out.print(i + " ");
      }
    }

  }
}

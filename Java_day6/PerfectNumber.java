package com.java.day6;

import java.util.Scanner;

public class PerfectNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check if its a perfect number ");

    int n = sc.nextInt();
    sc.close();

    int factorSum = 1;
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) factorSum += i;
    }

    if (factorSum == n) System.out.println("The entered number is perfect number :)");
    else System.out.println("The entered number is not a perfect number :(");

  }
}

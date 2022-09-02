package com.java.day5;

import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check even odd ");
    int num = sc.nextInt();
    sc.close();

    if (num % 2 == 0) System.out.print("Your number is even");
    else System.out.print("Your number is odd");

  }
}

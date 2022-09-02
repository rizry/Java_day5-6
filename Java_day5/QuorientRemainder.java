package com.java.day5;

import java.util.Scanner;

public class QuorientRemainder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the dividend (the number to be divided) ");
    int dividend = sc.nextInt();

    System.out.print("Now enter a number to divide that number by ");
    int divisor = sc.nextInt();
    sc.close();

    int quotient = dividend / divisor;
    int remainder = dividend % divisor;

    System.out.println("The quotient and remainder for your input is " + quotient + " " + remainder);
  }
}

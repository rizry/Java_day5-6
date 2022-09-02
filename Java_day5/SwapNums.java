package com.java.day5;

import java.util.Scanner;

public class SwapNums {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers a and b ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    int temp = a;
    a = b;
    b = temp;

    System.out.println("Swapped a and b are " + a + " " + b);

  }

}

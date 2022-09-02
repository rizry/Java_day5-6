package com.java.day5;

import java.util.Scanner;

public class LargestAmongThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter three numbers to find the largest of them ");

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    sc.close();

    int largestNum = 0;
    if (a > b) {
      if (a > c) largestNum = a;
      else largestNum = c;
    } 
    else if (b > c) largestNum = b;
    else largestNum = c;

    System.out.println("largest of them is " + largestNum);
  }
}

package com.java.day5;

import java.util.Scanner;

public class VowelConsonant {

  public static void main(String[] args) {
    char[] charArr = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a string to get vowels and consonants ");
    String str = sc.nextLine();
    sc.close();

    String vowels = "";
    String consonants = "";

    String charArrStr = new String(charArr);

    for (short i = 0; i < str.length(); i++) {
      if (new String(charArr).indexOf(str.charAt(i)) != -1) {
        vowels = vowels + str.charAt(i) + " ";
      } 
      else if ((int) str.charAt(i) == 32) continue;
      
      else {
        consonants = consonants + str.charAt(i) + " ";
      }
    }

    System.out.println("Vowels in the given string " + vowels);
    System.out.println("Consonants in the string " + consonants);
  }
}

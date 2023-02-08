package com.coding.leetcode.easy;

public class ValidPalindrome {

  public static void main(String[] args) {
    boolean palindrome = isPalindrome("race a car");
    System.out.println(palindrome);
  }

  public static boolean isPalindrome(String s) {

    String alphanumeric = s.replaceAll("[^a-zA-Z0-9]", "");
    String currentString = alphanumeric.toLowerCase();
    StringBuilder builder = new StringBuilder(currentString);
    StringBuilder reverse = builder.reverse();
    String reverseString = reverse.toString();
    return reverseString.equals(currentString);
  }
}

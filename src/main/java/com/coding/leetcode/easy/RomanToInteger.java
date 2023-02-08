package com.coding.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  public static void main(String[] args) {
    RomanToInteger romanToInteger = new RomanToInteger();
    int romanToInt = romanToInteger.romanToInt("V");
    System.out.println(romanToInt);
  }

  public int romanToInt(String s) {
    Map<String, Integer> map = new HashMap<>();
    map.put("I", 1);
    map.put("IV", 4);
    map.put("V", 5);
    map.put("IX", 9);
    map.put("X", 1);
    map.put("XL", 40);
    map.put("L", 50);
    map.put("XC", 90);
    map.put("C", 100);
    map.put("CD", 400);
    map.put("D", 500);
    map.put("CM", 900);
    map.put("M", 1000);
    return 5;
  }
}

package com.coding.leetcode.easy;

import java.util.Arrays;

public class TwoSum {
  public static void main(String[] args) {
    TwoSum twoSum = new TwoSum();
    int[] ints = twoSum.twoSum(new int[] {1, 2, 3, 4, 5, 6, 7}, 4);
    System.out.println(Arrays.toString(ints));
  }

  public int[] twoSum(int[] nums, int target) {
    int[] ans = new int[2];
    for (int i = 0; i < nums.length - 1; ++i) {
      for (int j = i + 1; j < nums.length; ++j) {
        if (nums[i] + nums[j] == target) {
          ans[0] = i;
          ans[1] = j;
          break;
        }
      }
    }
    return ans;
  }
}

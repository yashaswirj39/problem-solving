package com.yashaswi.striver.arrays;
//Striver Sheet - Linear Search
//Problem Link - https://leetcode.com/problems/move-zeroes/description/
public class MoveZeroToTheEnd {

    public static void moveZeroes(int[] nums) {
        int count = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                nums[j] = nums[i];
                j++;
            }
        }

        int i = nums.length - count;
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{0};
        moveZeroes(arr);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}

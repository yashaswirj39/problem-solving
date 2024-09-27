package com.yashaswi.striver.arrays;

//Strivers sheet = Left Rotate an array by one place
//Problem link - https://leetcode.com/problems/rotate-array/description/
public class RotateArray {

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k % nums.length != 0) {
            reverse(nums, 0, nums.length-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, nums.length-1);
        }
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1};
        int k = 2;
        rotate(arr, k);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}

package com.yashaswi.striver.arrays;

public class CheckIfArrayIsSorted {

    private static boolean check(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] <= nums[i]){
                continue;
            } return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check(new int[]{1, 2, 2, 3, 3, 4}));
        System.out.println(check(new int[]{1, 2, 1, 3, 4}));
    }
}

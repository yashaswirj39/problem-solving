package com.yashaswi.striver.arrays;

//Striver Sheet - Remove duplicates from Sorted array
//Problem Link = https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[j+1] = nums[i];
                j++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("=========1========");
        System.out.println(removeDuplicates(new int[]{1, 1, 2, 2, 2, 3, 3}));
        System.out.println("=========2========");
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println("=========3========");
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println("=========4========");
        System.out.println(removeDuplicates(new int[]{0,0,0,1,1,1,2,2,3,3,4}));
        System.out.println("=========5========");
        System.out.println(removeDuplicates(new int[]{0,1,2,3,4,5}));
        System.out.println("=========6========");
        System.out.println(removeDuplicates(new int[]{0}));
    }
}

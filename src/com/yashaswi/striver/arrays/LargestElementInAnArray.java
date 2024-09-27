package com.yashaswi.striver.arrays;

//Striver Sheet - https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2
//Problem Link - https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-element-in-array

public class LargestElementInAnArray {

    public static int largets(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int largestElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largestElement < arr[i]) {
                largestElement = arr[i];
            }
        }
        return largestElement;
    }
    public static void main(String[] args) {
        System.out.println(largets(new int[]{4, 3, 9, 2, 1}));
        System.out.println(largets(null));
        System.out.println(largets(new int[]{}));
        System.out.println(largets(new int[]{1}));
        System.out.println(largets(new int[]{1,2}));
    }
}

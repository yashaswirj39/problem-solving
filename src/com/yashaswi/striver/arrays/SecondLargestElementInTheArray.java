package com.yashaswi.striver.arrays;

//Striver Sheet - https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2
//Problem Link - https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest

public class SecondLargestElementInTheArray {

    private static int print2largest(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(print2largest(new int[]{1, 2, 4, 7, 7, 5}));
    }
}
//Other approaches

//Brute Force
//1. Sort the array in ascending order and traverse from last.
//The Last element will largest and
// following the reverse way the next smaller element will be the second largest
package com.yashaswi.striver.arrays;

//Striver Sheet - Linear Search
//Problem Link - https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=who-will-win
public class SortedAraySearch {

    static int searchInSorted(int arr[], int N, int K) {
        int start = 0;
        int end = N-1;
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == K) {
                return mid;
            } else if (K > arr[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,6};
        System.out.println(searchInSorted(arr, arr.length, 6));
    }
}

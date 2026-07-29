package Sorting;

import java.util.Arrays;

// Problem Name: Kth Largest Element in an Array
// Topic: Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1) (Ignoring the sorting algorithm's internal space)

public class KthLargestElementInArray {

    public int solution(int[] arr, int k) {

        Arrays.sort(arr);

        int n = arr.length;

        return arr[n - k];
    }

    public static void main(String[] args) {

        KthLargestElementInArray obj = new KthLargestElementInArray();

        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = obj.solution(arr);

        System.out.println("Kth Largest Element: " + result);
    }
}
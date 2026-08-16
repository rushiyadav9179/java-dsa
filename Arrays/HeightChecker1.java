package Arrays;

import java.util.Arrays;

// Problem Name: Height Checker
// Topic: Arrays, Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(n)

public class HeightChecker1 {

    public int solution(int[] heights) {

        int n = heights.length;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = heights[i];
        }

        Arrays.sort(arr);

        int count = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        HeightChecker obj = new HeightChecker();

        int[] heights = {1, 1, 4, 2, 1, 3};

        int result = obj.solution(heights);

        System.out.println("Students Out of Place: " + result);
    }
}
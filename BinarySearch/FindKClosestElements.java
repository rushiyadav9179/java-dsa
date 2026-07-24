package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Problem Name: Find K Closest Elements
// Topic: Binary Search, Two Pointers
// Time Complexity: O(log n + k log k)
// Space Complexity: O(k)

public class FindKClosestElements {

    public List<Integer> solution(int[] arr, int k, int x) {

        int low = 0;
        int high = arr.length - 1;
        int right = arr.length;

        // Find first element >= x (Lower Bound)
        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] >= x) {
                right = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        int left = right - 1;

        for(int i = 0; i < k; i++) {

            if(left < 0) {
                ans.add(arr[right]);
                right++;
            }
            else if(right >= arr.length) {
                ans.add(arr[left]);
                left--;
            }
            else if(x - arr[left] > arr[right] - x) {
                ans.add(arr[right]);
                right++;
            }
            else {
                ans.add(arr[left]);
                left--;
            }
        }

        Collections.sort(ans);

        return ans;
    }

    public static void main(String[] args) {

        FindKClosestElements obj = new FindKClosestElements();

        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;

        List<Integer> result = obj.solution(arr, k, x);

        System.out.println("K Closest Elements: " + result);
    }
}
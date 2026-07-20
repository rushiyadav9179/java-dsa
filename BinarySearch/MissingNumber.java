package BinarySearch;

import java.util.Arrays;

// Problem Name: Missing Number
// Topic: Arrays, Binary Search
// Time Complexity: O(n log n)
// Space Complexity: O(1)

public class MissingNumber {

    public int solution(int[] nums) {

        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(mid == nums[mid]) {
                low = mid + 1;
            }
            else {
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        MissingNumber obj = new MissingNumber();

        int[] nums = {3, 0, 1};

        int result = obj.solution(nums);

        System.out.println("Missing Number: " + result);
    }
}
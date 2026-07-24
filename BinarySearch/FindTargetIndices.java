package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem Name: Find Target Indices After Sorting Array
// Topic: Binary Search, Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(n) for output

public class FindTargetIndices {

    public List<Integer> solution(int[] nums, int target) {

        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;
        int first = -1;

        // Find first occurrence of target
        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                first = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if(first == -1) {
            return ans;
        }

        // Add all target indices
        for(int i = first; i < nums.length && nums[i] == target; i++) {
            ans.add(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        FindTargetIndices obj = new FindTargetIndices();

        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        List<Integer> result = obj.solution(nums, target);

        System.out.println("Target Indices: " + result);
    }
}
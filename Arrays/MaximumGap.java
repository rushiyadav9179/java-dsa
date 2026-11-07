package Arrays;

import java.util.Arrays;

public class MaximumGap {

    /*
     * Problem: Maximum Gap
     * Time Complexity: O(n log n)
     * Auxiliary Space: Depends on sorting implementation
     */

    public int solution(int[] nums) {

        if (nums == null || nums.length < 2) {
            return 0;
        }

        Arrays.sort(nums);

        int max = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, nums[i + 1] - nums[i]);
        }

        return max;
    }

    public static void main(String[] args) {

        MaximumGap obj = new MaximumGap();

        int[] nums = {3, 6, 9, 1};

        System.out.println("Output: " + obj.solution(nums));
    }
}
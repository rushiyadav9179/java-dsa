package Arrays;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    /*
     * Problem: Longest Consecutive Sequence
     * Time Complexity: O(n log n)
     * Space Complexity: O(1) auxiliary space
     */

    public int solution(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int count = 1;
        int max = 1;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if (nums[i] + 1 == nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {

        LongestConsecutiveSequence obj =
                new LongestConsecutiveSequence();

        int[] nums = {0, 1, 1, 2};

        System.out.println("Output: " + obj.solution(nums));
    }
}
// Problem Name: Longest Strictly Increasing or Strictly Decreasing Subarray
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LongestMonotonicSubarray {

    public int solution(int[] nums) {

        int count = 1;
        int max = Integer.MIN_VALUE;

        int i = 0;

        // Check Increasing Subarray
        while(i < nums.length - 1) {

            if(nums[i] < nums[i + 1]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }

            i++;
        }

        max = Math.max(max, count);

        // Reset for Decreasing Subarray
        count = 1;
        i = 0;

        // Check Decreasing Subarray
        while(i < nums.length - 1) {

            if(nums[i] > nums[i + 1]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }

            i++;
        }

        max = Math.max(max, count);

        return max;
    }

    public static void main(String[] args) {

        LongestMonotonicSubarray obj = new LongestMonotonicSubarray();

        int[] nums = {1, 4, 3, 3, 2};

        int result = obj.solution(nums);

        System.out.println("Longest Monotonic Subarray Length: " + result);
    }
}
// Problem Name: Maximum Subarray
// Topic: Arrays, Dynamic Programming (Kadane's Algorithm)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaximumSubarray {

    public int solution(int[] nums) {

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {

            sum += nums[i];

            max = Math.max(max, sum);

            if(sum < 0) {
                sum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        MaximumSubarray obj = new MaximumSubarray();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = obj.solution(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}
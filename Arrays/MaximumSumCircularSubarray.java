// Problem Name: Maximum Sum Circular Subarray
// Topic: Arrays, Dynamic Programming (Kadane's Algorithm)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaximumSumCircularSubarray {

    public int solution(int[] nums) {

        int n = nums.length;

        int maxSum = 0;
        int minSum = 0;

        int result1 = nums[0];
        int result2 = nums[0];

        int total = 0;

        for(int i = 0; i < n; i++) {

            maxSum += nums[i];
            result1 = Math.max(result1, maxSum);

            if(maxSum < 0) {
                maxSum = 0;
            }

            minSum += nums[i];
            result2 = Math.min(result2, minSum);

            if(minSum > 0) {
                minSum = 0;
            }

            total += nums[i];
        }

        if(result1 < 0) {
            return result1;
        }

        return Math.max(result1, total - result2);
    }

    public static void main(String[] args) {

        MaximumSumCircularSubarray obj = new MaximumSumCircularSubarray();

        int[] nums = {1, -2, 3, -2};

        int result = obj.solution(nums);

        System.out.println("Maximum Circular Subarray Sum: " + result);
    }
}
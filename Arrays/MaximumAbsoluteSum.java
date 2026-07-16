// Problem Name: Maximum Absolute Sum of Any Subarray
// Topic: Arrays, Dynamic Programming (Kadane's Algorithm)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaximumAbsoluteSum {

    public int solution(int[] nums) {

        int pSum = 0;
        int pMax = nums[0];

        int nSum = 0;
        int nMax = nums[0];

        for(int i = 0; i < nums.length; i++) {

            // Maximum Subarray Sum (Kadane)
            pSum += nums[i];
            pMax = Math.max(pMax, pSum);

            if(pSum < 0) {
                pSum = 0;
            }

            // Minimum Subarray Sum (Reverse Kadane)
            nSum += nums[i];
            nMax = Math.min(nMax, nSum);

            if(nSum > 0) {
                nSum = 0;
            }
        }

        return Math.max(pMax, Math.abs(nMax));
    }

    public static void main(String[] args) {

        MaximumAbsoluteSum obj = new MaximumAbsoluteSum();

        int[] nums = {1, -3, 2, 3, -4};

        int result = obj.solution(nums);

        System.out.println("Maximum Absolute Sum: " + result);
    }
}
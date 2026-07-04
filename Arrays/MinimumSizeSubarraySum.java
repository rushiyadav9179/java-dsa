// Problem Name: Minimum Size Subarray Sum
// Topic: Arrays, Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MinimumSizeSubarraySum {

    public int solution(int target, int[] nums) {

        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;

        while(right < nums.length) {

            sum += nums[right];

            while(sum >= target) {

                min = Math.min(min, right - left + 1);

                sum -= nums[left];
                left++;
            }

            right++;
        }

        return (min == Integer.MAX_VALUE) ? 0 : min;
    }

    public static void main(String[] args) {

        MinimumSizeSubarraySum obj = new MinimumSizeSubarraySum();

        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        int result = obj.solution(target, nums);

        System.out.println("Minimum Length: " + result);
    }
}
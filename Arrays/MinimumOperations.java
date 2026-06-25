// Problem Name: Minimum Operations to Make Array Sum Divisible by K
// Topic: Arrays, Math
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MinimumOperations {

    public int solution(int[] nums, int k) {

        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum % k;
    }

    public static void main(String[] args) {

        MinimumOperations obj = new MinimumOperations();

        int[] nums = {3, 9, 7};
        int k = 5;

        int result = obj.solution(nums, k);

        System.out.println("Minimum Operations: " + result);
    }
}
// Problem Name: Max Consecutive Ones
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaxConsecutiveOnes {

    public int solution(int[] nums) {

        int count = 0;
        int max = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 1) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        MaxConsecutiveOnes obj = new MaxConsecutiveOnes();

        int[] nums = {1, 1, 0, 1, 1, 1};

        int result = obj.solution(nums);

        System.out.println("Maximum Consecutive Ones: " + result);
    }
}
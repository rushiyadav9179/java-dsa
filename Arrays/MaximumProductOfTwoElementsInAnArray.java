
// Problem Name: Maximum Product of Two Elements in an Array
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaximumProductOfTwoElementsInAnArray {

    public int solution(int[] nums) {

        int n = nums.length;

        int max = 0;
        int secondMax = 0;

        for(int i = 0; i < n; i++) {

            if(nums[i] >= max) {
                secondMax = max;
                max = nums[i];
            }
            else if(nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return (max - 1) * (secondMax - 1);
    }

    public static void main(String[] args) {

        MaximumProductOfTwoElementsInAnArray obj = new MaximumProductOfTwoElementsInAnArray();

        int[] nums = {3, 4, 5, 2};

        int result = obj.solution(nums);

        System.out.println("Maximum Product: " + result);
    }
}
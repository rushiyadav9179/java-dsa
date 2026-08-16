package Arrays;

// Problem Name: First Missing Positive
// Topic: Arrays, Cyclic Placement
// Time Complexity: O(n)
// Space Complexity: O(1)

public class FirstMissingPositive {

    public int solution(int[] nums) {

        int n = nums.length;

        // Put every number x at index x - 1
        for (int i = 0; i < n; i++) {

            while (nums[i] >= 1 &&
                   nums[i] <= n &&
                   nums[nums[i] - 1] != nums[i]) {

                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Find the first position where the number is incorrect
        for (int i = 0; i < n; i++) {

            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    // For testing in VS Code
    public static void main(String[] args) {

        FirstMissingPositive obj = new FirstMissingPositive();

        int[] nums = {3, 4, -1, 1};

        int result = obj.solution(nums);

        System.out.println("First Missing Positive: " + result);
    }
}
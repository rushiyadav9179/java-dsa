package Arrays;

// Problem Name: Find the Duplicate Number
// Topic: Arrays, Two Pointers, Floyd's Cycle Detection
// Time Complexity: O(n)
// Space Complexity: O(1)

public class FindDuplicateNumber {

    public int solution(int[] nums) {

        // Phase 1: Find intersection point
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        // Phase 2: Find entrance of the cycle
        slow = nums[0];

        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    // For testing in VS Code
    public static void main(String[] args) {

        FindDuplicateNumber obj = new FindDuplicateNumber();

        int[] nums = {1, 3, 4, 2, 2};

        int result = obj.solution(nums);

        System.out.println("Duplicate Number: " + result);
    }
}
// Problem Name: Find Pivot Index
// Topic: Arrays, Prefix Sum
// Time Complexity: O(n)
// Space Complexity: O(1)

public class PivotIndex {

    public int solution(int[] nums) {

        int sum = 0;

        // Create Prefix Sum Array
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }

        // Check Index 0
        if(nums[nums.length - 1] - nums[0] == 0) {
            return 0;
        }

        // Check Remaining Indices
        for(int j = 1; j < nums.length; j++) {

            if(nums[nums.length - 1] - nums[j - 1] - nums[j] == 0) {
                return j;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        PivotIndex obj = new PivotIndex();

        int[] nums = {1, 7, 3, 6, 5, 6};

        int result = obj.solution(nums);

        System.out.println("Pivot Index: " + result);
    }
}
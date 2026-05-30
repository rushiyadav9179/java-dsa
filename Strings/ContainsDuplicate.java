import java.util.Arrays;

// Problem Name: Contains Duplicate
// Topic: Arrays, Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1)

public class ContainsDuplicate {

    public boolean solution(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ContainsDuplicate obj = new ContainsDuplicate();

        int[] nums = {1, 2, 3, 1};

        boolean result = obj.solution(nums);

        System.out.println("Contains Duplicate: " + result);
    }
}
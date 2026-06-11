import java.util.Arrays;

// Problem Name: Missing Number
// Topic: Arrays, Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1)

public class MissingNumber {

    public int solution(int[] nums) {

        Arrays.sort(nums);

        int i = 0;

        while(i < nums.length) {

            if(i != nums[i]) {
                return i;
            }

            i++;
        }

        return i;
    }

    public static void main(String[] args) {

        MissingNumber obj = new MissingNumber();

        int[] nums = {3, 0, 1};

        int result = obj.solution(nums);

        System.out.println("Missing Number: " + result);
    }
}
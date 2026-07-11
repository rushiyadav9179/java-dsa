import java.util.Arrays;

// Problem Name: Array Partition
// Topic: Arrays, Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1)

public class ArrayPartition {

    public int solution(int[] nums) {

        Arrays.sort(nums);

        int sum = 0;

        for(int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        ArrayPartition obj = new ArrayPartition();

        int[] nums = {1, 4, 3, 2};

        int result = obj.solution(nums);

        System.out.println("Maximum Sum of Minimum Pairs: " + result);
    }
}
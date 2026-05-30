import java.util.Arrays;

// Problem Name: Majority Element
// Topic: Arrays, Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1)

public class MajorityElement {

    public int solution(int[] nums) {

        Arrays.sort(nums);

        int mid = nums.length / 2;

        return nums[mid];
    }

    public static void main(String[] args) {

        MajorityElement obj = new MajorityElement();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = obj.solution(nums);

        System.out.println("Majority Element: " + result);
    }
}
import java.util.Arrays;

// Problem Name: Product of Array Except Self
// Topic: Arrays, Prefix Product, Suffix Product
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ProductOfArrayExceptSelf {

    public int[] solution(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {

            if(i == 0) {
                left[i] = 1;
            }
            else {
                left[i] = left[i - 1] * nums[i - 1];
            }
        }

        for(int i = nums.length - 1; i >= 0; i--) {

            if(i == nums.length - 1) {
                right[i] = 1;
            }
            else {
                right[i] = right[i + 1] * nums[i + 1];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            left[i] = left[i] * right[i];
        }

        return left;
    }

    public static void main(String[] args) {

        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();

        int[] nums = {1, 2, 3, 4};

        int[] result = obj.solution(nums);

        System.out.println("Output: " + Arrays.toString(result));
    }
}
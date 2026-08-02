
// Problem Name: Sign of the Product of an Array
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SignOfTheProductOfAnArray {

    public int solution(int[] nums) {

        int nCount = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == 0) {
                return 0;
            }

            if(nums[i] < 0) {
                nCount++;
            }
        }

        if(nCount % 2 != 0) {
            return -1;
        }

        return 1;
    }

    public static void main(String[] args) {

        SignOfTheProductOfAnArray obj = new SignOfTheProductOfAnArray();

        int[] nums = {-1, -2, -3, -4, 3, 2, 1};

        int result = obj.solution(nums);

        System.out.println("Sign of Product: " + result);
    }
}
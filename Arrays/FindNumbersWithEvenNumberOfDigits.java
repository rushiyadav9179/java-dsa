package Arrays;

// Problem Name: Find Numbers with Even Number of Digits
// Topic: Arrays, Math
// Time Complexity: O(n * d), where d is the maximum number of digits
// Space Complexity: O(1)

public class FindNumbersWithEvenNumberOfDigits {

    public int solution(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;

            while (num > 0) {
                num /= 10;
                digits++;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        FindNumbersWithEvenNumberOfDigits obj =
                new FindNumbersWithEvenNumberOfDigits();

        int[] nums = {12, 345, 2, 6, 7896};

        int result = obj.solution(nums);

        System.out.println("Output: " + result);
    }
}
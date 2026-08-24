package Arrays;

// Problem Name: How Many Numbers Are Smaller Than the Current Number
// Topic: Arrays, Brute Force
// Time Complexity: O(n²)
// Space Complexity: O(n)

public class SmallerNumbersThanCurrent {

    public int[] solution(int[] nums) {

        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {

            int count = 0;

            for(int j = 0; j < nums.length; j++) {

                if(nums[i] > nums[j]) {
                    count++;
                }
            }

            arr[i] = count;
        }

        return arr;
    }

    // For testing in VS Code
    public static void main(String[] args) {

        SmallerNumbersThanCurrent obj =
                new SmallerNumbersThanCurrent();

        int[] nums = {8, 1, 2, 2, 3};

        int[] result = obj.solution(nums);

        System.out.print("Result: ");

        for(int num : result) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
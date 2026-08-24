package Arrays;

// Problem Name: Remove Duplicates from Sorted Array II
// Topic: Arrays, Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RemoveDuplicatesFromSortedArrayII {

    public int solution(int[] nums) {

        if(nums.length <= 2) {
            return nums.length;
        }

        int j = 2;

        for(int i = 2; i < nums.length; i++) {

            if(nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    // For testing in VS Code
    public static void main(String[] args) {

        RemoveDuplicatesFromSortedArrayII obj =
                new RemoveDuplicatesFromSortedArrayII();

        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = obj.solution(nums);

        System.out.println("Number of elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();
    }
}
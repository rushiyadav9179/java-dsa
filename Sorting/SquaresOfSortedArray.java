package Sorting;

// Problem Name: Squares of a Sorted Array
// Topic: Arrays, Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(n)

public class SquaresOfSortedArray {

    public int[] solution(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int k = n - 1;

        while(left <= right) {

            int sqr1 = nums[left] * nums[left];
            int sqr2 = nums[right] * nums[right];

            if(sqr1 <= sqr2) {
                ans[k] = sqr2;
                right--;
            }
            else {
                ans[k] = sqr1;
                left++;
            }

            k--;
        }

        return ans;
    }

    public static void main(String[] args) {

        SquaresOfSortedArray obj = new SquaresOfSortedArray();

        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = obj.solution(nums);

        System.out.print("Sorted Squares: ");

        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
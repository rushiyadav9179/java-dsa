// Problem Name: Rotate Array
// Topic: Arrays, Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RotateArray {

    public void rev(int[] arr, int left, int right) {

        while(left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public void solution(int[] nums, int k) {

        k = k % nums.length;

        rev(nums, 0, nums.length - 1);

        rev(nums, 0, k - 1);

        rev(nums, k, nums.length - 1);
    }

    public static void main(String[] args) {

        RotateArray obj = new RotateArray();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        obj.solution(nums, k);

        System.out.print("Rotated Array: ");

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
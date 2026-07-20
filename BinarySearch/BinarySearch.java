package BinarySearch;
// Problem Name: Binary Search
// Topic: Arrays, Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class BinarySearch {

    public int solution(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        BinarySearch obj = new BinarySearch();

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = obj.solution(nums, target);

        System.out.println("Target Index: " + result);
    }
}
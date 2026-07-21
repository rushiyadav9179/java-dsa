package BinarySearch;

// Problem Name: Search in Rotated Sorted Array
// Topic: Arrays, Binary Search, Rotated Sorted Array
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class SearchInRotatedSortedArray {

    public int solution(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if(nums[low] <= nums[mid]) {

                if(nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            // Right half is sorted
            else {

                if(nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = obj.solution(nums, target);

        System.out.println("Target Index: " + result);
    }
}
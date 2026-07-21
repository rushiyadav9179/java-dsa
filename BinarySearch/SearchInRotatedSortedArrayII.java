package BinarySearch;

// Problem Name: Search in Rotated Sorted Array II
// Topic: Binary Search, Rotated Sorted Array, Duplicates
// Time Complexity: Average O(log n), Worst O(n)
// Space Complexity: O(1)

public class SearchInRotatedSortedArrayII {

    public boolean solution(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                return true;
            }

            // Cannot identify sorted half because of duplicates
            if(nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
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

        return false;
    }

    public static void main(String[] args) {

        SearchInRotatedSortedArrayII obj =
            new SearchInRotatedSortedArrayII();

        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;

        boolean result = obj.solution(nums, target);

        System.out.println("Target Found: " + result);
    }
}
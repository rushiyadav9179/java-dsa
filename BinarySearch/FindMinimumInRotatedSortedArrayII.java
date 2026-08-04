package BinarySearch;

// Problem Name: Find Minimum in Rotated Sorted Array II
// Topic: Binary Search
// Time Complexity: O(log n) Average, O(n) Worst Case (due to duplicates)
// Space Complexity: O(1)

public class FindMinimumInRotatedSortedArrayII {

    public int solution(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while(low < high) {

            int mid = low + (high - low) / 2;

            if(nums[mid] > nums[high]) {
                low = mid + 1;
            }
            else if(nums[mid] < nums[high]) {
                high = mid;
            }
            else {
                high--;
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {

        FindMinimumInRotatedSortedArrayII obj = new FindMinimumInRotatedSortedArrayII();

        int[] nums = {2, 2, 2, 0, 1};

        int result = obj.solution(nums);

        System.out.println("Minimum Element: " + result);
    }
}
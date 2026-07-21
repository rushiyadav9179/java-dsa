package BinarySearch;

// Problem Name: Find Minimum in Rotated Sorted Array
// Topic: Binary Search, Rotated Sorted Array
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class FindMinimumInRotatedSortedArray {

    public int solution(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        int ans = nums[0];

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(nums[mid] >= nums[high]) {

                ans = Math.min(ans, nums[mid]);
                low = mid + 1;
            }
            else {

                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        FindMinimumInRotatedSortedArray obj =
            new FindMinimumInRotatedSortedArray();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int result = obj.solution(nums);

        System.out.println("Minimum Element: " + result);
    }
}
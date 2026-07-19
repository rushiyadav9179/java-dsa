package BinarySearch;

// Problem Name: Find First and Last Position of Element in Sorted Array
// Topic: Arrays, Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class FindFirstAndLastPosition {

    public int[] solution(int[] nums, int k) {

        int[] arr = {-1, -1};

        // Find First Position
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(nums[mid] == k) {
                arr[0] = mid;
                high = mid - 1;
            }
            else if(nums[mid] < k) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // Find Last Position
        int low2 = 0;
        int high2 = nums.length - 1;

        while(low2 <= high2) {

            int mid2 = low2 + (high2 - low2) / 2;

            if(nums[mid2] == k) {
                arr[1] = mid2;
                low2 = mid2 + 1;
            }
            else if(nums[mid2] < k) {
                low2 = mid2 + 1;
            }
            else {
                high2 = mid2 - 1;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        FindFirstAndLastPosition obj = new FindFirstAndLastPosition();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int k = 8;

        int[] result = obj.solution(nums, k);

        System.out.println(
            "First Position: " + result[0] +
            ", Last Position: " + result[1]
        );
    }
}

package BinarySearch;

// Problem Name: Find Peak Element
// Topic: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class FindPeakElement {

    public int solution(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while(low < high) {

            int mid = low + (high - low) / 2;

            // Increasing slope → peak exists on right side
            if(nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            }

            // Decreasing slope → mid can itself be peak
            else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        FindPeakElement obj = new FindPeakElement();

        int[] nums = {1, 2, 3, 1};

        int result = obj.solution(nums);

        System.out.println("Peak Element Index: " + result);
        System.out.println("Peak Element: " + nums[result]);
    }
}
package BinarySearch;

// Problem Name: Search Insert Position
// Topic: Arrays, Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class SearchInsertPosition {

    public int solution(int[] nums, int k) {

        if(nums[0] > k) {
            return 0;
        }

        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(nums[mid] == k) {
                return mid;
            }

            if(nums[mid] >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        SearchInsertPosition obj = new SearchInsertPosition();

        int[] nums = {1, 3, 5, 6};
        int k = 2;

        int result = obj.solution(nums, k);

        System.out.println("Search Insert Position: " + result);
    }
}

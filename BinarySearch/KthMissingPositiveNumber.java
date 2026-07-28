package BinarySearch;

// Problem Name: Kth Missing Positive Number
// Topic: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class KthMissingPositiveNumber {

    public int solution(int[] arr, int k) {

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            // Missing numbers till arr[mid]
            int missing = arr[mid] - (mid + 1);

            if(missing < k) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return low + k;
    }

    public static void main(String[] args) {

        KthMissingPositiveNumber obj = new KthMissingPositiveNumber();

        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        int result = obj.solution(arr, k);

        System.out.println("Kth Missing Positive Number: " + result);
    }
}
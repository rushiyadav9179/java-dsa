package BinarySearch;

// Problem Name: Peak Index in a Mountain Array
// Topic: Binary Search, Mountain Array
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class PeakIndexInMountainArray {

    public int solution(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while(low < high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        PeakIndexInMountainArray obj = new PeakIndexInMountainArray();

        int[] arr = {0, 2, 5, 7, 4, 1};

        int result = obj.solution(arr);

        System.out.println("Peak Index: " + result);
        System.out.println("Peak Element: " + arr[result]);
    }
}
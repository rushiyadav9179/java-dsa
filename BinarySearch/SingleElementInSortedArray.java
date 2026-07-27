package BinarySearch;

// Problem Name: Single Element in a Sorted Array
// Topic: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class SingleElementInSortedArray {

    public int solution(int[] arr) {

        int n = arr.length;

        if(n == 1) {
            return arr[0];
        }

        if(arr[0] != arr[1]) {
            return arr[0];
        }

        if(arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }

        int low = 1;
        int high = n - 2;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            // Found the single element
            if(arr[mid - 1] != arr[mid] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }

            // We are on the correct pairing side
            else if((mid % 2 == 1 && arr[mid - 1] == arr[mid]) ||
                    (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {

                low = mid + 1;
            }

            // We are on the disrupted pairing side
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        SingleElementInSortedArray obj = new SingleElementInSortedArray();

        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        int result = obj.solution(arr);

        System.out.println("Single Element: " + result);
    }
}
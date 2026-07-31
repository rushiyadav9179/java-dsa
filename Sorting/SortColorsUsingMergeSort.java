package Sorting;

// Problem Name: Sort Colors
// Topic: Merge Sort
// Time Complexity: O(n log n)
// Space Complexity: O(n)

public class SortColorsUsingMergeSort {

    public void divide(int[] arr, int low, int high) {

        if(low < high) {

            int mid = low + (high - low) / 2;

            divide(arr, low, mid);
            divide(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    public void merge(int[] arr, int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }

        for(int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = low;

        while(i < n1 && j < n2) {

            if(left[i] <= right[j]) {
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }

        while(i < n1) {
            arr[k++] = left[i++];
        }

        while(j < n2) {
            arr[k++] = right[j++];
        }
    }

    public void solution(int[] arr) {
        divide(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {

        SortColorsUsingMergeSort obj = new SortColorsUsingMergeSort();

        int[] arr = {2, 0, 2, 1, 1, 0};

        obj.solution(arr);

        System.out.print("Sorted Array: ");

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}

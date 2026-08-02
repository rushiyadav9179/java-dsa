package Sorting;

// Problem Name: Quick Sort
// Topic: Sorting, Divide and Conquer
// Time Complexity: O(n log n) on average, O(n^2) in the worst case
// Space Complexity: O(log n) due to recursion stack

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];

        while(low<=high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    public static void main(String[] args) {
    
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.print("Original Array: ");
        printArray(arr);
        
        quickSort(arr, 0, arr.length - 1);

        System.out.print("\nSorted Array: ");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
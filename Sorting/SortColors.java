package Sorting;

// Problem Name: Sort Colors
// Topic: Sorting (Insertion Sort)
// Time Complexity: O(n²)
// Space Complexity: O(1)

public class SortColors {

    public void solution(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        SortColors obj = new SortColors();

        int[] arr = {2, 0, 2, 1, 1, 0};

        obj.solution(arr);

        System.out.print("Sorted Array: ");

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
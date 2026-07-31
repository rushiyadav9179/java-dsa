package Sorting;

// Problem Name: Merge Sorted Array
// Topic: Two Pointers, Merge
// Time Complexity: O(m + n)
// Space Complexity: O(1)

public class MergeSortedArray {

    public void solution(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;

        while(i >= 0 && j >= 0) {

            if(nums1[i] <= nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            }
            else {
                nums1[k] = nums1[i];
                i--;
            }

            k--;
        }

        while(j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {

        MergeSortedArray obj = new MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        obj.solution(nums1, m, nums2, n);

        System.out.print("Merged Array: ");

        for(int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
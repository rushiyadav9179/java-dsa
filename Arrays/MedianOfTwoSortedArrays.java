import java.util.ArrayList;
import java.util.Collections;

// Problem Name: Median of Two Sorted Arrays
// Topic: Arrays, Sorting
// Time Complexity: O((m + n) log(m + n))
// Space Complexity: O(m + n)

public class MedianOfTwoSortedArrays {

    public double solution(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums1) {
            list.add(num);
        }

        for(int num : nums2) {
            list.add(num);
        }

        Collections.sort(list);

        int n = list.size();

        if(n % 2 == 0) {

            int mid1 = n / 2;
            int mid2 = n / 2 - 1;

            return (list.get(mid1) + list.get(mid2)) / 2.0;

        } else {

            int mid = n / 2;
            return list.get(mid);
        }
    }

    public static void main(String[] args) {

        MedianOfTwoSortedArrays obj = new MedianOfTwoSortedArrays();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double result = obj.solution(nums1, nums2);

        System.out.println("Median: " + result);
    }
}
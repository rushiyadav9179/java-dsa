import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem Name: Intersection of Two Arrays II
// Topic: Arrays, Sorting, Two Pointers
// Time Complexity: O(n log n + m log m)
// Space Complexity: O(min(n, m))

public class IntersectionOfTwoArraysII {

    public int[] solution(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        while(i < nums1.length && j < nums2.length) {

            if(nums1[i] == nums2[j]) {

                list.add(nums1[i]);

                i++;
                j++;

            } else if(nums1[i] > nums2[j]) {

                j++;

            } else {

                i++;
            }
        }

        int[] arr = new int[list.size()];

        for(int k = 0; k < list.size(); k++) {
            arr[k] = list.get(k);
        }

        return arr;
    }

    public static void main(String[] args) {

        IntersectionOfTwoArraysII obj = new IntersectionOfTwoArraysII();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = obj.solution(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(result));
    }
}
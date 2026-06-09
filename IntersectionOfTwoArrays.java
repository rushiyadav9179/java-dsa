import java.util.Arrays;
import java.util.HashSet;

// Problem Name: Intersection of Two Arrays
// Topic: Arrays, HashSet, Two Pointers, Sorting
// Time Complexity: O(n log n + m log m)
// Space Complexity: O(n)

public class IntersectionOfTwoArrays {

    public int[] solution(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        while(i < nums1.length && j < nums2.length) {

            if(nums1[i] == nums2[j]) {

                set.add(nums1[i]);

                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]) {
                j++;
            }
            else {
                i++;
            }
        }

        int[] arr = new int[set.size()];

        int index = 0;

        for(int num : set) {
            arr[index++] = num;
        }

        return arr;
    }

    public static void main(String[] args) {

        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = obj.solution(nums1, nums2);

        System.out.println("Intersection: " + Arrays.toString(result));
    }
}

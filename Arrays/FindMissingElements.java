package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Problem Name: Find Missing Elements
// Topic: Arrays, HashSet
// Time Complexity: O(n + (max - min))
// Space Complexity: O(n)

public class FindMissingElements {

    public List<Integer> solution(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            set.add(nums[i]);

            if(min > nums[i]) {
                min = nums[i];
            }

            if(max < nums[i]) {
                max = nums[i];
            }
        }

        for(int i = min; i < max; i++) {

            if(!set.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        FindMissingElements obj = new FindMissingElements();

        int[] nums = {4, 2, 9, 6, 5};

        List<Integer> result = obj.solution(nums);

        System.out.println("Missing Elements: " + result);
    }
}
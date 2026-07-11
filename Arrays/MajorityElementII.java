import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem Name: Majority Element II
// Topic: Arrays, Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1) (excluding output list)

public class MajorityElementII {

    public List<Integer> solution(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();

        int occ = nums.length / 3;

        Arrays.sort(nums);

        int count = 1;

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] == nums[i + 1]) {
                count++;
            } else {

                if(count > occ) {
                    list.add(nums[i]);
                }

                count = 1;
            }
        }

        if(count > occ) {
            list.add(nums[nums.length - 1]);
        }

        return list;
    }

    public static void main(String[] args) {

        MajorityElementII obj = new MajorityElementII();

        int[] nums = {3, 2, 3};

        List<Integer> result = obj.solution(nums);

        System.out.println("Majority Elements: " + result);
    }
}
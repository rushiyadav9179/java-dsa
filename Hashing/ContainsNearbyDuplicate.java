import java.util.HashMap;

// Problem Name: Contains Duplicate II
// Topic: Arrays, HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ContainsNearbyDuplicate {

    public boolean solution(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            if(map.containsKey(nums[i])) {

                int diff = i - map.get(nums[i]);

                if(diff <= k) {
                    return true;
                }
            }

            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {

        ContainsNearbyDuplicate obj = new ContainsNearbyDuplicate();

        int[] nums = {1, 2, 3, 1};
        int k = 3;

        boolean result = obj.solution(nums, k);

        System.out.println("Contains Nearby Duplicate: " + result);
    }
}
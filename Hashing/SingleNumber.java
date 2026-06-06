import java.util.HashMap;

// Problem Name: Single Number
// Topic: Arrays, HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

public class SingleNumber {

    public int solution(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key : map.keySet()) {

            if(map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        SingleNumber obj = new SingleNumber();

        int[] nums = {4, 1, 2, 1, 2};

        int result = obj.solution(nums);

        System.out.println("Single Number: " + result);
    }
}

// git add SingleNumber
// git commit -m "Solved Single Number using HashMap frequency counting"
// git push
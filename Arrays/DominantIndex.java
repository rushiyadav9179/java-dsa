// Problem Name: Largest Number At Least Twice of Others
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

public class DominantIndex {

    public int solution(int[] nums) {

        int max = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] > nums[max]) {
                max = i;
            }
        }

        for(int j = 0; j < nums.length; j++) {

            if(nums[j] * 2 > nums[max] && nums[j] != nums[max]) {
                return -1;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        DominantIndex obj = new DominantIndex();

        int[] nums = {3, 6, 1, 0};

        int result = obj.solution(nums);

        System.out.println("Dominant Index: " + result);
    }
}
// Problem Name: Third Maximum Number
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ThirdMaximumNumber {

    public int solution(int[] nums) {

        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] > max) {
                tmax = smax;
                smax = max;
                max = nums[i];
            }
            else if(nums[i] < max && nums[i] > smax) {
                tmax = smax;
                smax = nums[i];
            }
            else if(nums[i] < smax && nums[i] > tmax) {
                tmax = nums[i];
            }
        }

        if(tmax == Long.MIN_VALUE) {
            return (int) max;
        }

        return (int) tmax;
    }

    public static void main(String[] args) {

        ThirdMaximumNumber obj = new ThirdMaximumNumber();

        int[] nums = {2, 2, 3, 1};

        int result = obj.solution(nums);

        System.out.println("Third Maximum: " + result);
    }
}
// Problem Name: Remove Element
// Topic: Arrays, Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RemoveElement {

    public int solution(int[] nums, int val) {

        int bp = nums.length - 1;
        int count = 0;

        for(int j = 0; j < nums.length; j++) {
            if(nums[j] == val) {
                count++;
            }
        }

        for(int i = 0; i <= bp;) {

            if(nums[i] == val) {

                if(nums[bp] == val) {
                    bp--;
                } else {
                    nums[i] = nums[bp];
                    bp--;
                    i++;
                }

            } else {
                i++;
            }
        }

        return nums.length - count;
    }

    public static void main(String[] args) {

        RemoveElement obj = new RemoveElement();

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int result = obj.solution(nums, val);

        System.out.println("Length: " + result);

        System.out.print("Array: ");

        for(int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
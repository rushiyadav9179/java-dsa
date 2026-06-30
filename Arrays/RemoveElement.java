// Problem Name: Remove Element
// Topic: Arrays, Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RemoveElement {

    public int solution(int[] nums, int val) {

        int n = nums.length - 1;
        int i = 0;

        while(i <= n) {

            if(nums[i] == val) {
                nums[i] = nums[n];
                n--;
            } else {
                i++;
            }
        }

        return n + 1;
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
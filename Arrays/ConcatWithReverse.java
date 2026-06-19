// Problem Name: Concatenation of Array with Reverse
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ConcatWithReverse {

    public int[] solution(int[] nums) {

        int len = nums.length;

        int[] arr = new int[len * 2];

        int i = len - 1;
        int j = len;

        while(i >= 0) {

            arr[i] = nums[i];

            arr[j] = nums[i];

            i--;
            j++;
        }

        return arr;
    }

    public static void main(String[] args) {

        ConcatWithReverse obj = new ConcatWithReverse();

        int[] nums = {1, 2, 3, 4};

        int[] result = obj.solution(nums);

        System.out.print("Output: ");

        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
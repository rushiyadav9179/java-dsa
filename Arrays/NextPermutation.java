// Problem Name: Next Permutation
// Topic: Arrays, Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class NextPermutation {

    public void solution(int[] nums) {

        if(nums.length <= 1) {
            return;
        }

        int i = nums.length - 2;

        while(i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if(i == -1) {

            int left = 0;
            int right = nums.length - 1;

            while(left < right) {

                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }

            return;
        }

        int idx = 0;

        for(int j = nums.length - 1; j > i; j--) {

            if(nums[i] < nums[j]) {
                idx = j;
                break;
            }
        }

        int temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;

        int left = i + 1;
        int right = nums.length - 1;

        while(left < right) {

            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        NextPermutation obj = new NextPermutation();

        int[] nums = {2, 4, 5, 8, 3, 1};

        obj.solution(nums);

        System.out.print("Next Permutation: ");

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
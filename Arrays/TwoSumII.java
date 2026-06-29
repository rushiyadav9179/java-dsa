// Problem Name: Two Sum II - Input Array Is Sorted
// Topic: Arrays, Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class TwoSumII {

    public int[] solution(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {

            if(numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if(numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        TwoSumII obj = new TwoSumII();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.solution(numbers, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
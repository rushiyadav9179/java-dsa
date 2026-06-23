// Problem Name: Find First and Last Position of Element in Sorted Array
// Topic: Arrays, Linear Search
// Time Complexity: O(n)
// Space Complexity: O(1)
public class SearchRange {

    public int[] solution(int[] nums, int target) {

        int[] arr = {-1, -1};

        boolean first = false;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == target) {

                if(!first) {
                    arr[0] = i;
                    first = true;
                }

                arr[1] = i;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        SearchRange obj = new SearchRange();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = obj.solution(nums, target);

        System.out.println("First Position: " + result[0]);
        System.out.println("Last Position : " + result[1]);
    }
}
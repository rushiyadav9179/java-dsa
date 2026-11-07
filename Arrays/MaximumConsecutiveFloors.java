package Arrays;

import java.util.Arrays;

public class MaximumConsecutiveFloors {

    /*
     * Problem: Maximum Consecutive Floors Without Special Floors
     * Time Complexity: O(n log n)
     * Space Complexity: Depends on sorting implementation
     */

    public int solution(int bottom, int top, int[] special) {

        if (special == null || special.length == 0) {
            return top - bottom + 1;
        }

        Arrays.sort(special);

        int max = Math.max(
                special[0] - bottom,
                top - special[special.length - 1]
        );

        for (int i = 0; i < special.length - 1; i++) {

            int diff = special[i + 1] - special[i];

            max = Math.max(max, diff - 1);
        }

        return max;
    }

    public static void main(String[] args) {

        MaximumConsecutiveFloors obj =
                new MaximumConsecutiveFloors();

        int bottom = 2;
        int top = 9;
        int[] special = {4, 6};

        System.out.println("Output: " +
                obj.solution(bottom, top, special));
    }
}
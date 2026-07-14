import java.util.*;

// Problem Name: Spiral Matrix II
// Topic: Matrix
// Time Complexity: O(n²)
// Space Complexity: O(n²)

public class SpiralMatrixII {

    public int[][] solution(int n) {

        int[][] ans = new int[n][n];

        int left = 0;
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;

        int count = 1;

        while(top <= bottom && left <= right) {

            // Left to Right
            for(int i = left; i <= right; i++) {
                ans[top][i] = count++;
            }

            // Top to Bottom
            for(int i = top + 1; i <= bottom; i++) {
                ans[i][right] = count++;
            }

            // Right to Left
            if(top < bottom) {
                for(int i = right - 1; i >= left; i--) {
                    ans[bottom][i] = count++;
                }
            }

            // Bottom to Top
            if(left < right) {
                for(int i = bottom - 1; i > top; i--) {
                    ans[i][left] = count++;
                }
            }

            top++;
            left++;
            right--;
            bottom--;
        }

        return ans;
    }

    public static void main(String[] args) {

        SpiralMatrixII obj = new SpiralMatrixII();

        int n = 3;

        int[][] result = obj.solution(n);

        System.out.println("Spiral Matrix:");

        for(int[] row : result) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
import java.util.*;

// Problem Name: Transpose Matrix
// Topic: Matrix
// Time Complexity: O(m × n)
// Space Complexity: O(m × n)

public class TransposeMatrix {

    public int[][] solution(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] ans = new int[cols][rows];

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        TransposeMatrix obj = new TransposeMatrix();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] result = obj.solution(matrix);

        System.out.println("Transposed Matrix:");

        for(int[] row : result) {
            for(int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
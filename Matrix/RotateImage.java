import java.util.*;

// Problem Name: Rotate Image
// Topic: Matrix
// Time Complexity: O(n²)
// Space Complexity: O(1)

public class RotateImage {

    public void solution(int[][] mat) {

        int n = mat.length;

        // Transpose the matrix
        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Reverse each row
        for(int row = 0; row < n; row++) {

            int left = 0;
            int right = n - 1;

            while(left < right) {

                int temp = mat[row][left];
                mat[row][left] = mat[row][right];
                mat[row][right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        RotateImage obj = new RotateImage();

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        obj.solution(mat);

        System.out.println("Rotated Matrix:");

        for(int[] row : mat) {
            for(int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
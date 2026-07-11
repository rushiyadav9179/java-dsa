import java.util.*;

// Problem Name: Matrix Diagonal Sum
// Topic: Matrix
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MatrixDiagonalSum {

    public int solution(int[][] mat) {

        int n = mat.length;

        int sum1 = 0;
        int sum2 = 0;

        for(int k = 0; k < n; k++) {

            int row = k;
            int col = n - 1 - k;

            if(row != col) {
                sum1 += mat[row][col];
            }

            sum2 += mat[k][k];
        }

        return sum1 + sum2;
    }

    public static void main(String[] args) {

        MatrixDiagonalSum obj = new MatrixDiagonalSum();

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = obj.solution(mat);

        System.out.println("Diagonal Sum: " + result);
    }
}   
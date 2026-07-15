import java.util.ArrayList;

// Problem Name: Set Matrix Zeroes
// Topic: Matrix
// Time Complexity: O((R × C) + Z × (R + C))
// Space Complexity: O(Z)

public class SetMatrixZeroes {

    public void solution(int[][] mat) {

        ArrayList<Integer> rowz = new ArrayList<>();
        ArrayList<Integer> colz = new ArrayList<>();

        int n = mat.length;
        int m = mat[0].length;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(mat[i][j] == 0) {
                    rowz.add(i);
                    colz.add(j);
                }
            }
        }

        for(int i = 0; i < rowz.size(); i++) {

            for(int row = 0; row < n; row++) {
                mat[row][colz.get(i)] = 0;
            }

            for(int col = 0; col < m; col++) {
                mat[rowz.get(i)][col] = 0;
            }
        }
    }

    public static void main(String[] args) {

        SetMatrixZeroes obj = new SetMatrixZeroes();

        int[][] mat = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        obj.solution(mat);

        System.out.println("Matrix After Setting Zeroes:");

        for(int[] row : mat) {
            for(int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
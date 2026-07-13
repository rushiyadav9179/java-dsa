// Problem Name: Toeplitz Matrix
// Topic: Matrix
// Time Complexity: O(m × n)
// Space Complexity: O(1)

public class ToeplitzMatrix {

    public boolean solution(int[][] matrix) {

        for(int i = 1; i < matrix.length; i++) {

            for(int j = 1; j < matrix[0].length; j++) {

                if(matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        ToeplitzMatrix obj = new ToeplitzMatrix();

        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 1, 2, 3},
            {9, 5, 1, 2}
        };

        boolean result = obj.solution(matrix);

        System.out.println("Is Toeplitz Matrix: " + result);
    }
}
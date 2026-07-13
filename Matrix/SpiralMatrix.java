import java.util.ArrayList;
import java.util.List;

// Problem Name: Spiral Matrix
// Topic: Matrix
// Time Complexity: O(m × n)
// Space Complexity: O(1) (excluding output list)

public class SpiralMatrix {

    public List<Integer> solution(int[][] matrix) {

        ArrayList<Integer> arr = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int left = 0;
        int right = cols - 1;
        int bottom = rows - 1;

        while(top <= bottom && left <= right) {

            // Left to Right
            for(int i = left; i <= right; i++) {
                arr.add(matrix[top][i]);
            }

            // Top to Bottom
            for(int i = top + 1; i <= bottom; i++) {
                arr.add(matrix[i][right]);
            }

            // Right to Left
            if(top < bottom) {
                for(int i = right - 1; i >= left; i--) {
                    arr.add(matrix[bottom][i]);
                }
            }

            // Bottom to Top
            if(left < right) {
                for(int i = bottom - 1; i > top; i--) {
                    arr.add(matrix[i][left]);
                }
            }

            top++;
            right--;
            bottom--;
            left++;
        }

        return arr;
    }

    public static void main(String[] args) {

        SpiralMatrix obj = new SpiralMatrix();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = obj.solution(matrix);

        System.out.println("Spiral Order: " + result);
    }
}
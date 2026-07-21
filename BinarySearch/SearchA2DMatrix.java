package BinarySearch;

// Problem Name: Search a 2D Matrix
// Topic: Binary Search, Matrix
// Time Complexity: O(log m + log n)
// Space Complexity: O(1)

public class SearchA2DMatrix {

    public boolean solution(int[][] matrix, int target) {

        int rlow = 0;
        int rhigh = matrix.length - 1;
        int row = 0;

        // Binary Search to find the possible row
        while(rlow <= rhigh) {

            int mid = rlow + (rhigh - rlow) / 2;

            if(matrix[mid][0] <= target &&
               target <= matrix[mid][matrix[0].length - 1]) {

                row = mid;
                break;
            }
            else if(matrix[mid][0] < target) {
                rlow = mid + 1;
            }
            else {
                rhigh = mid - 1;
            }
        }

        // Binary Search inside the selected row
        int clow = 0;
        int chigh = matrix[0].length - 1;

        while(clow <= chigh) {

            int mid = clow + (chigh - clow) / 2;

            if(matrix[row][mid] == target) {
                return true;
            }
            else if(matrix[row][mid] < target) {
                clow = mid + 1;
            }
            else {
                chigh = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        SearchA2DMatrix obj = new SearchA2DMatrix();

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 3;

        boolean result = obj.solution(matrix, target);

        System.out.println("Target Found: " + result);
    }
}
package BinarySearch;

// Problem Name: Find a Peak Element II
// Topic: Binary Search, 2D Matrix
// Time Complexity: O(m × log n)
// Space Complexity: O(1)

public class FindPeakGrid {

    public int[] solution(int[][] mat) {

        int low = 0;
        int high = mat[0].length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            // Find row having maximum element in current column
            int max = 0;

            for(int i = 0; i < mat.length; i++) {

                if(mat[i][mid] > mat[max][mid]) {
                    max = i;
                }
            }

            int curr = mat[max][mid];

            int left = (mid == 0)
                    ? Integer.MIN_VALUE
                    : mat[max][mid - 1];

            int right = (mid == mat[0].length - 1)
                    ? Integer.MIN_VALUE
                    : mat[max][mid + 1];

            // Peak found
            if(left < curr && curr > right) {
                return new int[]{max, mid};
            }

            // Move towards larger neighbour
            else if(left < curr) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        FindPeakGrid obj = new FindPeakGrid();

        int[][] mat = {
            {10, 20, 15},
            {21, 30, 14},
            {7, 16, 32}
        };

        int[] result = obj.solution(mat);

        System.out.println("Peak Position: [" + result[0] + ", " + result[1] + "]");
    }
}
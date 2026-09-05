// Problem Name: Count Negative Numbers in a Sorted Matrix
// Topic: Matrix, Binary Search
// Time Complexity: O(m log n)
// Space Complexity: O(1)

public class CountNegativeNumbers {

    public static int solution(int[][] grid) {

        int ans = 0;

        for (int i = 0; i < grid.length; i++) {

            int low = 0;
            int high = grid[0].length - 1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (grid[i][mid] >= 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            // All elements from low to the end are negative
            ans += grid[i].length - low;
        }

        return ans;
    }

    // For testing in VS Code
    public static void main(String[] args) {

        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };

        int result = solution(grid);

        System.out.println("Number of Negative Numbers: " + result);
    }
}
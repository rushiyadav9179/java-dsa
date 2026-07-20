package BinarySearch;

// Problem Name: Guess Number Higher or Lower
// Topic: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

/*
 * The GuessGame class and guess() API are provided by LeetCode.
 *
 * guess(num) returns:
 *  -1 → num is higher than picked number
 *   1 → num is lower than picked number
 *   0 → num is equal to picked number
 */

public class GuessNumberHigherOrLower extends GuessGame {

    public int guessNumber(int n) {

        int low = 1;
        int high = n;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int result = guess(mid);

            if(result == 0) {
                return mid;
            }
            else if(result == 1) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
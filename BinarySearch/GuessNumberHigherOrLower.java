package BinarySearch;

// Problem Name: Guess Number Higher or Lower
// Topic: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class GuessNumberHigherOrLower {

    private int pick;

    public GuessNumberHigherOrLower(int pick) {
        this.pick = pick;
    }

    public int guess(int num) {

        if(num == pick) {
            return 0;
        }
        else if(num < pick) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public int solution(int n) {

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

    public static void main(String[] args) {

        int n = 10;
        int pick = 6;

        GuessNumberHigherOrLower obj =
            new GuessNumberHigherOrLower(pick);

        int result = obj.solution(n);

        System.out.println("Picked Number: " + result);
    }
}
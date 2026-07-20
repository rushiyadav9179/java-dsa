package BinarySearch;

// Problem Name: Valid Perfect Square
// Topic: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class ValidPerfectSquare {

    public boolean solution(int num) {

        if(num < 2) {
            return true;
        }

        long low = 1;
        long high = num / 2;

        while(low <= high) {

            long mid = low + (high - low) / 2;

            long square = mid * mid;

            if(square == num) {
                return true;
            }
            else if(square < num) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ValidPerfectSquare obj = new ValidPerfectSquare();

        int num = 16;

        boolean result = obj.solution(num);

        System.out.println("Is Perfect Square: " + result);
    }
}
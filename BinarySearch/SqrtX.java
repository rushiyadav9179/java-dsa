package BinarySearch;

// Problem Name: Sqrt(x)
// Topic: Binary Search, Binary Search on Answer
// Time Complexity: O(log x)
// Space Complexity: O(1)

public class SqrtX {

    public int solution(int x) {

        int ans = 0;

        if(x < 2) {
            return x;
        }

        int low = 1;
        int high = x / 2;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            if(square <= x) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        SqrtX obj = new SqrtX();

        int x = 8;

        int result = obj.solution(x);

        System.out.println("Square Root: " + result);
    }
}
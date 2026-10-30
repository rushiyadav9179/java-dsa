
// Problem Name: Count Commas in Range
// Topic: Math
// Time Complexity: O(1)
// Space Complexity: O(1)

public class CountCommasInRange {

    public int solution(int n) {
        int ans = n - 999;

        if (ans < 0) {
            return 0;
        }

        return ans;
    }

    public static void main(String[] args) {
        CountCommasInRange obj = new CountCommasInRange();

        int n = 1005;
        int result = obj.solution(n);

        System.out.println("Input: n = " + n);
        System.out.println("Output: " + result);
    }
}
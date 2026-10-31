
// Problem Name: String to Integer (atoi)
// Topic: Strings, Math, Overflow Handling
// Time Complexity: O(n)
// Space Complexity: O(1)

public class StringToIntegerAtoi {

    public int solution(String s) {
        int n = s.length();
        int i = 0;

        // Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Handle sign
        int sign = 1;

        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        long result = 0;

        // Convert digits
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';

            result = result * 10 + digit;

            // Handle overflow
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (result * sign);
    }

    public static void main(String[] args) {
        StringToIntegerAtoi obj = new StringToIntegerAtoi();

        String s = "   -42";

        int result = obj.solution(s);

        System.out.println("Input: " + s);
        System.out.println("Output: " + result);
    }
}
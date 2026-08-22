package Math;

// Problem Name: Check Divisibility
// Topic: Math, Digit Manipulation
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class CheckDivisibility {

    public boolean solution(int n) {

        int sum = 0;
        int original = n;
        int product = 1;

        while(n != 0) {

            int digit = n % 10;

            sum += digit;
            product *= digit;

            n /= 10;
        }

        int value = product + sum;

        return original % value == 0;
    }

    // For testing in VS Code
    public static void main(String[] args) {

        CheckDivisibility obj = new CheckDivisibility();

        int n = 99;

        boolean result = obj.solution(n);

        System.out.println("Is Divisible: " + result);
    }
}
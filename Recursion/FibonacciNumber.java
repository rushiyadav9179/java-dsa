package Recursion;

// Problem Name: Fibonacci Number
// Topic: Dynamic Programming, Math
// Time Complexity: O(n)
// Space Complexity: O(1)

public class FibonacciNumber {

    public int solution(int n) {

        if(n <= 1) {
            return n;
        }

        int pre = 0;
        int first = 1;
        int curr;

        for(int i = 1; i < n; i++) {

            curr = pre + first;

            pre = first;

            first = curr;
        }

        return first;
    }

    public static void main(String[] args) {

        FibonacciNumber obj = new FibonacciNumber();

        int n = 6;

        int result = obj.solution(n);

        System.out.println("Fibonacci Number: " + result);
    }
}// Problem Name: Fibonacci Number
// Topic: Dynamic Programming, Math
// Time Complexity: O(n)
// Space Complexity: O(1)

public class FibonacciNumber {

    public int solution(int n) {

        if(n <= 1) {
            return n;
        }

        int pre = 0;
        int first = 1;
        int curr;

        for(int i = 1; i < n; i++) {

            curr = pre + first;

            pre = first;

            first = curr;
        }

        return first;
    }

    public static void main(String[] args) {

        FibonacciNumber obj = new FibonacciNumber();

        int n = 6;

        int result = obj.solution(n);

        System.out.println("Fibonacci Number: " + result);
    }
}
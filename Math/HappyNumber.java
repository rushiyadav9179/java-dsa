// Problem Name: Happy Number
// Topic: Math, Hashing
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class HappyNumber {

    public boolean solution(int n) {

        int digit;

        while(true) {

            int sum = 0;

            while(n > 0) {

                digit = n % 10;

                sum += digit * digit;

                n = n / 10;
            }

            if(sum == 1) {
                return true;
            }

            if(sum == 4) {
                return false;
            }

            n = sum;
        }
    }

    public static void main(String[] args) {

        HappyNumber obj = new HappyNumber();

        int n = 19;

        boolean result = obj.solution(n);

        System.out.println("Is Happy Number: " + result);
    }
}
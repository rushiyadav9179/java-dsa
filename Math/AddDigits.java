// Problem Name: Add Digits
// Topic: Math
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class AddDigits {

    public int solution(int num) {

        while(true) {

            int sum = 0;

            while(num > 0) {

                int digit = num % 10;

                sum += digit;

                num = num / 10;
            }

            if(sum <= 9) {
                return sum;
            }

            num = sum;
        }
    }

    public static void main(String[] args) {

        AddDigits obj = new AddDigits();

        int num = 38;

        int result = obj.solution(num);

        System.out.println("Single Digit Sum: " + result);
    }
}

// git add AddDigits.java
// git commit -m "Solved Add Digits using repeated digit sum"
// git push
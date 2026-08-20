package Math;

// Problem Name: Number of Steps to Reduce a Number to Zero
// Topic: Math, Simulation
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class NumberOfStepsToReduceANumberToZero {

    public int solution(int num) {

        int count = 0;

        while(num != 0) {

            if(num % 2 == 0) {
                num = num / 2;
            }
            else {
                num = num - 1;
            }

            count++;
        }

        return count;
    }

    // For testing in VS Code
    public static void main(String[] args) {

        NumberOfStepsToReduceANumberToZero obj =
                new NumberOfStepsToReduceANumberToZero();

        int num = 14;

        int result = obj.solution(num);

        System.out.println("Number of Steps: " + result);
    }
}
// Problem Name: Plus One
// Topic: Arrays, Math
// Time Complexity: O(n)
// Space Complexity: O(n) (Only when a new array is created)

public class PlusOne {

    public int[] solution(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--) {

            if(digits[i] != 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;

        return newArr;
    }

    public static void main(String[] args) {

        PlusOne obj = new PlusOne();

        int[] digits = {9, 9, 9};

        int[] result = obj.solution(digits);

        System.out.print("Result: ");

        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
// Problem Name: Multiply Strings
// Topic: Strings, Math, Simulation
// Time Complexity: O(n × m)
// Space Complexity: O(n + m)

public class MultiplyStrings {

    public String removeZero(String s) {

        int i = 0;

        while(i < s.length() - 1 && s.charAt(i) == '0') {
            i++;
        }

        return s.substring(i);
    }

    public String solution(String num1, String num2) {

        if(num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        boolean isNegative = false;

        if(num1.charAt(0) == '-') {
            isNegative = !isNegative;
            num1 = num1.substring(1);
        }

        if(num2.charAt(0) == '-') {
            isNegative = !isNegative;
            num2 = num2.substring(1);
        }

        num1 = removeZero(num1);
        num2 = removeZero(num2);

        int n = num1.length();
        int m = num2.length();

        int[] result = new int[n + m];

        for(int i = n - 1; i >= 0; i--) {

            for(int j = m - 1; j >= 0; j--) {

                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                int sum = product + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int num : result) {

            if(!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return isNegative ? "-" + sb.toString() : sb.toString();
    }

    public static void main(String[] args) {

        MultiplyStrings obj = new MultiplyStrings();

        String num1 = "123";
        String num2 = "456";

        String result = obj.solution(num1, num2);

        System.out.println("Product: " + result);
    }
}
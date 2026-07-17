// Problem Name: Add Binary
// Topic: Strings, Math
// Time Complexity: O(max(n, m))
// Space Complexity: O(max(n, m))

public class AddBinary {

    public String solution(String a, String b) {

        StringBuilder ans = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if(i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if(j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            ans.append(sum % 2);
            carry = sum / 2;
        }

        return ans.reverse().toString();
    }

    public static void main(String[] args) {

        AddBinary obj = new AddBinary();

        String a = "1010";
        String b = "1011";

        String result = obj.solution(a, b);

        System.out.println("Binary Sum: " + result);
    }
}
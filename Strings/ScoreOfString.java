
// Problem Name: Score of a String
// Topic: Strings
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ScoreOfString {

    public int solution(String s) {

        int sum = 0;

        for(int i = 0; i < s.length() - 1; i++) {

            int val = Math.abs(s.charAt(i) - s.charAt(i + 1));

            sum += val;
        }

        return sum;
    }

    public static void main(String[] args) {

        ScoreOfString obj = new ScoreOfString();

        String s = "hello";

        int result = obj.solution(s);

        System.out.println("Score of String: " + result);
    }
}
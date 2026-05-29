// Problem Name: Length of Last Word
// Topic: Strings
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LengthOfLastWord {

    public int solution(String s) {

        s = s.trim();

        for(int i = s.length() - 1; i >= 0; i--) {

            if(s.charAt(i) == ' ') {
                return s.length() - 1 - i;
            }
        }

        return s.length();
    }

    public static void main(String[] args) {

        LengthOfLastWord obj = new LengthOfLastWord();

        String s = "Hello World";

        int result = obj.solution(s);

        System.out.println("Length of Last Word: " + result);
    }
}
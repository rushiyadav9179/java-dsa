// Problem Name: Truncate Sentence
// Topic: Strings
// Time Complexity: O(n)
// Space Complexity: O(n)

public class TruncateSentence {

    public static String solution(String s, int k) {

        String ans = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                count++;
            }

            if (count == k) {
                break;
            }

            ans = ans + s.charAt(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "Hello how are you Contestant";
        int k = 4;

        String result = solution(s, k);

        System.out.println("Input: " + s);
        System.out.println("K: " + k);
        System.out.println("Output: " + result);
    }
}
// Problem Name: Reverse Words in a String
// Topic: Strings, Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ReverseWordsInString {

    public String solution(String s) {

        String[] words = s.trim().split("\\s+");

        int left = 0;
        int right = words.length - 1;

        while(left < right) {

            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {

        ReverseWordsInString obj = new ReverseWordsInString();

        String s = "  the sky is blue  ";

        String result = obj.solution(s);

        System.out.println("Reversed Words: " + result);
    }
}
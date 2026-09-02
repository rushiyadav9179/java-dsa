// Problem Name: Valid Palindrome
// Topic: Strings, Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ValidPalindrome {

    public static boolean solution(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            char left = s.charAt(i);
            char right = s.charAt(j);

            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean result = solution(s);

        System.out.println("Input: " + s);
        System.out.println("Is Palindrome: " + result);
    }
}
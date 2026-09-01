package Strings;

// Problem Name: Shuffle String
// Topic: Strings, Array Mapping
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ShuffleString {

    public String solution(String s, int[] indices) {

        char[] ans = new char[s.length()];

        for(int i = 0; i < s.length(); i++) {
            ans[indices[i]] = s.charAt(i);
        }

        return new String(ans);
    }

    // For testing in VS Code
    public static void main(String[] args) {

        ShuffleString obj = new ShuffleString();

        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        String result = obj.solution(s, indices);

        System.out.println("Shuffled String: " + result);
    }
}
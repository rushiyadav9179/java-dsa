package Strings;

import java.util.HashSet;

// Problem Name: Longest Substring Without Repeating Characters
// Topic: Strings, Sliding Window, HashSet
// Time Complexity: O(n)
// Space Complexity: O(min(n, charset size))

public class LongestSubstringWithoutRepeatingCharacters {

    public int solution(String s) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters obj =
                new LongestSubstringWithoutRepeatingCharacters();

        String s = "abcabcbb";

        int result = obj.solution(s);

        System.out.println("Input: " + s);
        System.out.println("Output: " + result);
    }
}
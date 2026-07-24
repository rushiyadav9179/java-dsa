package Strings;

// Problem Name: Longest Common Prefix
// Topic: Strings, String Comparison
// Time Complexity: O(n * m)
// Space Complexity: O(1)

public class LongestCommonPrefix {

    public int common(String s1, String s2) {

        if(s1.length() == 0 || s2.length() == 0) {
            return 0;
        }

        if(s1.length() > s2.length()) {
            return common(s2, s1);
        }

        int count = 0;

        for(int i = 0; i < s1.length(); i++) {

            if(s1.charAt(i) != s2.charAt(i)) {
                return count;
            }

            count++;
        }

        return count;
    }

    public String solution(String[] strs) {

        if(strs == null || strs.length == 0) {
            return "";
        }

        if(strs.length == 1) {
            return strs[0];
        }

        int mincount = Integer.MAX_VALUE;
        String first = strs[0];

        for(int i = 0; i < strs.length; i++) {

            int count = common(first, strs[i]);

            mincount = Math.min(mincount, count);
        }

        return first.substring(0, mincount);
    }

    public static void main(String[] args) {

        LongestCommonPrefix obj = new LongestCommonPrefix();

        String[] strs = {"flower", "flow", "flight"};

        String result = obj.solution(strs);

        System.out.println("Longest Common Prefix: " + result);
    }
}
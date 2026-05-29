// Problem Name: Find the Index of the First Occurrence in a String
// Topic: Strings
// Time Complexity: O(n * m)
// Space Complexity: O(1)

public class FindFirstOccurrence {

    public int solution(String haystack, String needle) {

        for(int i = 0; i < haystack.length() - needle.length() + 1; i++) {

            if(haystack.charAt(i) == needle.charAt(0)) {

                if(haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        FindFirstOccurrence obj = new FindFirstOccurrence();

        String haystack = "hello";
        String needle = "ll";

        int result = obj.solution(haystack, needle);

        System.out.println("Index: " + result);
    }
}
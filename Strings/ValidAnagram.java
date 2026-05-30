import java.util.HashMap;

// Problem Name: Valid Anagram
// Topic: Strings, HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ValidAnagram {

    public boolean solution(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            map.put(s.charAt(i),
                    map.getOrDefault(s.charAt(i), 0) + 1);

            map.put(t.charAt(i),
                    map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(int count : map.values()) {

            if(count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        ValidAnagram obj = new ValidAnagram();

        String s = "anagram";
        String t = "nagaram";

        boolean result = obj.solution(s, t);

        System.out.println("Is Anagram: " + result);
    }
}
import java.util.HashMap;

// Problem Name: First Unique Character in a String
// Topic: Strings, HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

public class FirstUniqueCharacter {

    public int solution(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if(map.get(c) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        FirstUniqueCharacter obj = new FirstUniqueCharacter();

        String s = "leetcode";

        int result = obj.solution(s);

        System.out.println("First Unique Character Index: " + result);
    }
}
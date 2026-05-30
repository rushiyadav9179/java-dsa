import java.util.HashMap;

// Problem Name: Isomorphic Strings
// Topic: Strings, HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

public class IsomorphicStrings {

    public boolean solution(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if(map.containsKey(sc) && map.containsValue(tc)) {
                // Mapping already exists
            }
            else if(map.containsKey(sc) || map.containsValue(tc)) {
                return false;
            }

            map.put(sc, tc);
        }

        return true;
    }

    public static void main(String[] args) {

        IsomorphicStrings obj = new IsomorphicStrings();

        String s = "egg";
        String t = "add";

        boolean result = obj.solution(s, t);

        System.out.println("Isomorphic: " + result);
    }
}
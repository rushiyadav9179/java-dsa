import java.util.HashMap;

// Problem Name: Isomorphic Strings
// Topic: Strings, HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

public class IsomorphicStrings {

    public boolean solution(String s, String t) {

        HashMap<Character, Character> sToT = new HashMap<>();
        HashMap<Character, Character> tToS = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {

            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if(!sToT.containsKey(sc) && !tToS.containsKey(tc)) {

                sToT.put(sc, tc);
                tToS.put(tc, sc);

            } else if(sToT.get(sc) == null) {

                return false;

            } else if(tToS.get(tc) == null) {

                return false;

            } else if(sToT.get(sc) != tc && tToS.get(tc) != sc) {

                return false;
            }
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
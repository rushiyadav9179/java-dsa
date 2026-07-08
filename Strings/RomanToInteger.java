import java.util.HashMap;

// Problem Name: Roman to Integer
// Topic: Strings, HashMap
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RomanToInteger {

    public int solution(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        if(s.length() == 1) {
            return map.get(s.charAt(0));
        }

        int sum = 0;

        for(int i = 0; i < s.length() - 1; i++) {

            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {

                sum += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                i++;

            } else {

                sum += map.get(s.charAt(i));
            }

            if(s.length() - 2 == i) {
                sum += map.get(s.charAt(i + 1));
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        RomanToInteger obj = new RomanToInteger();

        String s = "MCMXCIV";

        int result = obj.solution(s);

        System.out.println("Integer Value: " + result);
    }
}
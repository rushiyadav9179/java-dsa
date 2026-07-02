package Stack;
import java.util.HashMap;
import java.util.Stack;
// Problem Name: Valid Parentheses
// Topic: Stack, HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ValidParentheses {

    public boolean solution(String s) {

        HashMap<Character, Character> map = new HashMap<>();

        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {

            if(map.containsKey(c)) {

                stack.push(c);

            } else {

                if(stack.isEmpty()) {
                    return false;
                }

                char t = stack.pop();

                if(c != map.get(t)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        ValidParentheses obj = new ValidParentheses();

        String s = "()[]{}";

        boolean result = obj.solution(s);

        System.out.println("Is Valid: " + result);
    }
}
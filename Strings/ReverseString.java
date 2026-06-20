// Problem Name: Reverse String
// Topic: Strings, Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ReverseString {

    public void solution(char[] s) {

        char temp;

        for(int left = 0, right = s.length - 1; left < right; left++, right--) {

            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }

    public static void main(String[] args) {

        ReverseString obj = new ReverseString();

        char[] s = {'h', 'e', 'l', 'l', 'o'};

        obj.solution(s);

        System.out.print("Reversed String: ");

        for(char ch : s) {
            System.out.print(ch);
        }
    }
}
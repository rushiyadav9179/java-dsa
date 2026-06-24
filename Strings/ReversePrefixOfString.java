// Problem Name: Reverse Prefix of String
// Topic: Strings, Two Pointers
// Time Complexity: O(k)
// Space Complexity: O(n)

public class ReversePrefixOfString {

    public String solution(String s, int k) {

        if(k == 1) {
            return s;
        }

        char[] arr = s.toCharArray();

        int f = 0;
        int l = k - 1;

        while(f < l) {

            char temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;

            f++;
            l--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        ReversePrefixOfString obj = new ReversePrefixOfString();

        String s = "abcdefd";
        int k = 3;

        String result = obj.solution(s, k);

        System.out.println("Result: " + result);
    }
}
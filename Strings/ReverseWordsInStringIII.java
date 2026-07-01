// Problem Name: Reverse Words in a String III
// Topic: Strings, Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(n)

public class ReverseWordsInStringIII {

    public void rev(char[] arr, int left, int right) {

        while(left < right) {

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public String solution(String s) {

        char[] arr = s.toCharArray();

        int start = 0;

        for(int end = 0; end < arr.length; end++) {

            if(arr[end] == ' ') {

                rev(arr, start, end - 1);

                start = end + 1;
            }
        }

        rev(arr, start, arr.length - 1);

        return new String(arr);
    }

    public static void main(String[] args) {

        ReverseWordsInStringIII obj = new ReverseWordsInStringIII();

        String s = "Let's take LeetCode contest";

        String result = obj.solution(s);

        System.out.println("Result: " + result);
    }
}
package BinarySearch;

// Problem Name: Find Smallest Letter Greater Than Target
// Topic: Binary Search, Upper Bound
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class NextGreatestLetter {

    public char solution(char[] letters, char target) {

        int k = target - 'a';

        int low = 0;
        int high = letters.length - 1;

        char ans = letters[0];

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(letters[mid] - 'a' > k) {
                ans = letters[mid];
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        NextGreatestLetter obj = new NextGreatestLetter();

        char[] letters = {'c', 'f', 'j'};
        char target = 'd';

        char result = obj.solution(letters, target);

        System.out.println("Next Greatest Letter: " + result);
    }
}
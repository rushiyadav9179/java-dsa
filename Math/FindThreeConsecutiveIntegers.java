
public class FindThreeConsecutiveIntegers {

    /*
     * Problem: Find Three Consecutive Integers That Sum to a Given Number
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */

    public long[] solution(long num) {

        if (num % 3 != 0) {
            return new long[0];
        }

        long mid = num / 3;

        return new long[]{mid - 1, mid, mid + 1};
    }

    public static void main(String[] args) {

        FindThreeConsecutiveIntegers obj =
                new FindThreeConsecutiveIntegers();

        long num = 33;

        long[] result = obj.solution(num);

        System.out.print("Output: [");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
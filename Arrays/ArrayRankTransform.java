import java.util.Arrays;
import java.util.HashMap;

// Problem Name: Rank Transform of an Array
// Topic: Arrays, Sorting, HashMap
// Time Complexity: O(n log n)
// Space Complexity: O(n)

public class ArrayRankTransform {

    public int[] solution(int[] arr) {

        int[] temp = arr.clone();

        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        for(int i = 0; i < temp.length; i++) {

            if(!map.containsKey(temp[i])) {
                map.put(temp[i], rank);
                rank++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }

    public static void main(String[] args) {

        ArrayRankTransform obj = new ArrayRankTransform();

        int[] arr = {40, 10, 20, 30};

        int[] result = obj.solution(arr);

        System.out.print("Rank Transformed Array: ");

        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
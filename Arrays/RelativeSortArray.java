
import java.util.Arrays;

// Problem Name: Relative Sort Array
// Topic: Arrays, Sorting
// Time Complexity: O(n × m + k log k)
// Space Complexity: O(1)

public class RelativeSortArray {

    public int[] solution(int[] arr1, int[] arr2) {

        int first = 0;
        int ptr = 0;
        int i = 0;

        while(ptr < arr2.length) {

            int val = arr2[ptr];

            for(int j = i; j < arr1.length; j++) {

                if(arr1[j] == val) {

                    int temp = arr1[j];
                    arr1[j] = arr1[first];
                    arr1[first] = temp;

                    first++;
                }
            }

            ptr++;
            i++;
        }

        Arrays.sort(arr1, first, arr1.length);

        return arr1;
    }

    public static void main(String[] args) {

        RelativeSortArray obj = new RelativeSortArray();

        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};

        int[] result = obj.solution(arr1, arr2);

        System.out.print("Relative Sorted Array: ");

        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
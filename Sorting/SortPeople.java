package Sorting;

// Problem Name: Sort the People
// Topic: Arrays, Sorting (Bubble Sort)
// Time Complexity: O(n²)
// Space Complexity: O(1)

public class SortPeople {

    public String[] solution(String[] names, int[] heights) {

        for(int i = 0; i < names.length - 1; i++) {

            for(int j = 0; j < names.length - 1 - i; j++) {

                if(heights[j] < heights[j + 1]) {

                    // Swap heights
                    int tempHeight = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = tempHeight;

                    // Swap corresponding names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        return names;
    }

    public static void main(String[] args) {

        SortPeople obj = new SortPeople();

        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        String[] result = obj.solution(names, heights);

        System.out.print("Sorted People: ");

        for(String name : result) {
            System.out.print(name + " ");
        }
    }
}
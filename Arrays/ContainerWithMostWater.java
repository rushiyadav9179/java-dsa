package Arrays;

// Problem Name: Container With Most Water
// Topic: Arrays, Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ContainerWithMostWater {

    public int solution(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right) {

            int high = Math.min(height[left], height[right]);
            int breadth = right - left;

            int area = high * breadth;

            if(max < area) {
                max = area;
            }

            // Move the pointer with smaller height
            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return max;
    }

    // For testing in VS Code
    public static void main(String[] args) {

        ContainerWithMostWater obj = new ContainerWithMostWater();

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int result = obj.solution(height);

        System.out.println("Maximum Area: " + result);
    }
}
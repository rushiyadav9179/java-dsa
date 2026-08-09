package Sorting;

// Problem Name: Minimum Total Price After Applying Discounts
// Topic: Arrays, Sorting, Greedy
// Time Complexity: O(n log n + m log m)
// Space Complexity: O(1) (Ignoring sorting's internal space)

import java.util.Arrays;

public class MinimumTotalPriceAfterApplyingDiscounts {

    public double solution(int[] prices, int[] discounts) {

        Arrays.sort(prices);
        Arrays.sort(discounts);

        double sum = 0;

        int i = prices.length - 1;
        int j = discounts.length - 1;

        // Apply largest discounts to largest prices
        while(i >= 0 && j >= 0) {

            sum += prices[i] * (100.0 - discounts[j]) / 100.0;

            i--;
            j--;
        }

        // Remaining products have no discount
        while(i >= 0) {
            sum += prices[i];
            i--;
        }

        return sum;
    }

    public static void main(String[] args) {

        MinimumTotalPriceAfterApplyingDiscounts obj =
                new MinimumTotalPriceAfterApplyingDiscounts();

        int[] prices = {100, 200, 300};
        int[] discounts = {10, 20};

        double result = obj.solution(prices, discounts);

        System.out.println("Minimum Total Price: " + result);
    }
}
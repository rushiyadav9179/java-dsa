// Problem Name: Best Time to Buy and Sell Stock
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

public class BestTimeToBuyAndSellStock {

    public int solution(int[] prices) {

        int small = Integer.MAX_VALUE;
        int larg = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++) {

            if(larg < prices[i]) {
                larg = prices[i];
            }

            if(small > prices[i]) {
                small = prices[i];
                larg = prices[i];
            }
        }

        return larg - small;
    }

    public static void main(String[] args) {

        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = obj.solution(prices);

        System.out.println("Maximum Profit: " + result);
    }
}
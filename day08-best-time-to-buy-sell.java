/**
 * Problem: Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * 
 * Problem Statement:
 * You are given an array prices where prices[i] is the price of a given stock
 * on the ith day. You want to maximize your profit by choosing a single day
 * to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction.
 * 
 * Approach:
 * Track minimum price seen so far and maximum profit.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class BestTimeToBuySell {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        
        return maxProfit;
    }
    
    public static void main(String[] args) {
        BestTimeToBuySell solution = new BestTimeToBuySell();
        
        int[] test1 = {7, 1, 5, 3, 6, 4};
        System.out.println(solution.maxProfit(test1)); // 5
        
        int[] test2 = {7, 6, 4, 3, 1};
        System.out.println(solution.maxProfit(test2)); // 0
        
        int[] test3 = {2, 4, 1};
        System.out.println(solution.maxProfit(test3)); // 2
    }
}





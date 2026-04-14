package com.scaler.top_interview_programs.DSA;

public class BestTimeToBuySellStockBruteForce {
    public static void main(String[] args) {
        int [] prices = {3,8,14,12,6,8,1};
        int profit = bestTimeToBuyeSellStock(prices);
        System.out.println("The max profit will be = "+profit);
    }

    private static int bestTimeToBuyeSellStock(int[] prices) {
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i+1; j< prices.length; j++){
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
}

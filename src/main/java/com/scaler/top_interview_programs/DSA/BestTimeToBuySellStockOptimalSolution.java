package com.scaler.top_interview_programs.DSA;

public class BestTimeToBuySellStockOptimalSolution {
    public static void main(String[] args) {
        int [] prices = {3,8,14,12,6,8,1};
        int maxProfit = bestTimeToBuySellStock(prices);
        System.out.println("The maximum profit is "+maxProfit);
    }

    private static int bestTimeToBuySellStock(int[] prices) {
        int minPriceSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            if(price < minPriceSoFar){
                minPriceSoFar = price;
            }
            else {
                int profit = price - minPriceSoFar;
                maxProfit = Math.max(maxProfit , profit);
            }
        }
        return maxProfit;
    }
}

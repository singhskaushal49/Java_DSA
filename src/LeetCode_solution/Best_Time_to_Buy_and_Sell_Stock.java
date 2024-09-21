package LeetCode_solution;

public class Best_Time_to_Buy_and_Sell_Stock {
	
	class Solution {
	    public int maxProfit(int[] prices) {
	       int min = prices[0];
	       int profit = 0;

	       for (int i = 0; i<prices.length; i++){
	        if(prices[i] < min){
	            min = prices[i];
	        }
	        profit = Math.max(profit, prices[i] - min);
	       } 
	       return profit;
	    }
	}
}

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
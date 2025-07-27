// You are given an array prices where prices[i] is the stock price on day i. You can buy and sell the stock multiple times (but must sell before buying again). Find the maximum profit possible.

// Key Idea: "Buy Low, Sell High" Every Day

// Compare each day with the previous day:
// If today’s price (prices[i]) > yesterday’s (prices[i-1]), it means you could’ve bought yesterday and sold today for a profit.
// Add this profit (prices[i] - prices[i-1]) to the total.
// Why This Works:
// Instead of trying to time "big swings," you capture every small upward movement.
// Mathematically, this is equivalent to buying at every local minimum and selling at every local maximum.

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int minprice = prices[0];
        int maxprofit = 0;

        for (int i = 1; i < n; i++) {
            minprice = Math.min(minprice, prices[i]);
            int profit = prices[i] - minprice;
            maxprofit = Math.max(maxprofit, profit);
        }
        return maxprofit;
    }
}
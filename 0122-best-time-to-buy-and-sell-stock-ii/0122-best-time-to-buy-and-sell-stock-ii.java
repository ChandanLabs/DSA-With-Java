class Solution {
    public int maxProfit(int[] prices) {
        
        int i = 0;
        int n = prices.length;
        int maxProfit = 0;
        
        while (i < n - 1) {
            while (i < n - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            int buyPrice = prices[i]; // This is our local minimum
    
            while (i < n - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            int sellPrice = prices[i];
            maxProfit += sellPrice - buyPrice;
        }
        
        return maxProfit;
    }
}
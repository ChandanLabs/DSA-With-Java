class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxSum = 0;
        for(int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for(int j = 0; j < accounts[0].length; j++) {
                sum = sum + accounts[i][j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int n = accounts.length;
        for(int i = 0; i <n; i++){
        int sum = 0;

            for(int j = 0; j < accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
        max = Math.max(max, sum);
        }
        return max;
    }
}
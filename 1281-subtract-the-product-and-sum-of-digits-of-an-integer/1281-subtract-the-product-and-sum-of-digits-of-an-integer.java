class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int sum = 0;
        int mul = 1;
        while(n > 0){
            
            int rem = n % 10;
            sum = sum + rem;
            mul = mul * rem;
            n = n /10;
        }
        int ans = mul - sum;
        return ans;
    }
}
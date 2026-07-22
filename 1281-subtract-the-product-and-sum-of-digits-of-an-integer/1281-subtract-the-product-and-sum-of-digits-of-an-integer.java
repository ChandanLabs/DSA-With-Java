class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        // int ans;
        while(n > 0){
            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n/=10;
        }
        return product - sum;
    }
}
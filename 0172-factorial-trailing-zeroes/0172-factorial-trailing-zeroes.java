class Solution {
    public int trailingZeroes(int n) {
        int fact = 1;
        for(int i = 2; i <= n;  i++){
            fact = fact * i;
        }

         
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
         
        // int count = 0;
        // for(int i = 5; i * i <= n; i*=5){
        //     count = count + n / i;

        // }
        // return count;
    }
}
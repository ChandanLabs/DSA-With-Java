class Solution {
    public int trailingZeroes(int n) {
        // int fact = 1;
        // for(int i = 2; i <= n;  i++){
        //     fact = fact * i;
        // }

         
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
         

    }
}
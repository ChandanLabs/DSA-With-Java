class Solution {
    public boolean isUgly(int n) {
        if(n <= 0){
            return false;
        }
        // if(n % 2 == 0){
        //     n = n / 2;
        // }
        // else if(n % 3 == 0){
        //     n = n / 3;
        // }
        // else if(n % 5 == 0){
        //     n = n / 5;
        // }
        // return n == 1;
        for(int factor : new int[]{2, 3, 5}){

        while(n % factor == 0){
            n = n / factor;
        }
        
        }
        return n == 1;
    }
}
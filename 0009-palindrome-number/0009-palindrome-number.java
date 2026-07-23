class Solution {
    public boolean isPalindrome(int x) {
        
        int temp = x;
        int n = 0;
        while( x > 0){
            int rem = x % 10;
            n = rem + n * 10;
            x = x/10;
        }
        if(temp == n){
            return true;
        }
        return false;
    }
}
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        for(int i = n; i >= 0; i--){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            }
            else if(digits[i] == 9){
               digits[i] = 0;
            }
        }
        //this is the loop to handle the edge cases if all the numbers will be == 9 
        for(int i = n; i >= 1; i--){
            if(ans[i] == 9){
                ans[i] = 0;
            }
        }
        return ans;
    }
}
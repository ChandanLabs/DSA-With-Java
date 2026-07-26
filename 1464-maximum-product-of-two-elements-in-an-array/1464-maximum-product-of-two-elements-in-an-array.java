class Solution {
    public int maxProduct(int[] nums) {
       int min = 0;
       int max = 0;
        int ans = 1;
       for(int num : nums){
        if(num > max){
            min = max;
            max = num;
        }
        else if(num > min){
            min = num;
        }
        
       }
    return (max - 1) * (min - 1);
    }
}
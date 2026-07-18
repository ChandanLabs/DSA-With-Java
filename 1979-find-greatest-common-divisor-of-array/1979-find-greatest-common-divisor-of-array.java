class Solution {
    public int findGCD(int[] nums) {
        int max_val = nums[0];
        int min_val = nums[0];

        for(int i = 1; i < nums.length; i++){
            min_val = Math.min(min_val, nums[i]);
            max_val = Math.max(max_val, nums[i]);
        }
        int ans = GCD(min_val, max_val);
        return ans;
    }
    static int GCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
            
        }
        return a;
    }
}
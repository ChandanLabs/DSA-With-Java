class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int ans = 0;
        // int ans = 1;
        for(int i = 0; i < nums.length; i++){
            nums[i] = start + 2 * i;
            ans = ans ^ nums[i];
        }
        // for(int num : nums){
        //     ans = num ^ nums;
        // }
        return ans;
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxsum = nums[0];
        int sum = 0;
        
        int left = 0;
        for (int num : nums) {

            if (sum < 0) {
                sum = 0;
            }
            sum = sum + num;
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }
}
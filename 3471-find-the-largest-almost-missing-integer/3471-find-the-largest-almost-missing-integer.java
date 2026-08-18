class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        
        // Array to count frequencies since 0 <= nums[i] <= 50
        int[] freq = new int[51];
        for (int num : nums) {
            freq[num]++;
        }
        
        // Case 1: k == 1
        if (k == 1) {
            int maxVal = -1;
            for (int i = 0; i <= 50; i++) {
                if (freq[i] == 1) {
                    maxVal = Math.max(maxVal, i);
                }
            }
            return maxVal;
        }
        
        // Case 2: k == n
        if (k == n) {
            int maxVal = -1;
            for (int num : nums) {
                maxVal = Math.max(maxVal, num);
            }
            return maxVal;
        }
        
        // Case 3: 1 < k < n
        int maxVal = -1;
        if (freq[nums[0]] == 1) {
            maxVal = Math.max(maxVal, nums[0]);
        }
        if (freq[nums[n - 1]] == 1) {
            maxVal = Math.max(maxVal, nums[n - 1]);
        }
        
        return maxVal;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = nums[0];
        
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return nums[i];
            }
        }
        return ans;
    }
}
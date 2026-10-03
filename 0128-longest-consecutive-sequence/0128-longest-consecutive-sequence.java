class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1;
        int maxlen = 1;
        int i = 0;
        if(nums == null || n == 0) {
            return 0;
        }
        while(i < n - 1) {
            if(nums[i + 1] - nums[i] == 1) {
                count++;
                i++;
            }else if(nums[i + 1] - nums[i] == 0) {
                i++;
                continue;
            }else{
                i++;
                count = 1;
            }
            // i++;
            maxlen = Math.max(maxlen, count);
        }
        return maxlen;
    }
}
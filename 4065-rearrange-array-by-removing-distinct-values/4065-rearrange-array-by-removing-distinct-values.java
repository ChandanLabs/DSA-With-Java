class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] freq = new int[101];

        for(int num : nums) {
            freq[num]++;
        }
        int idx = 0;
        while(idx < n) {
            for(int val = 1; val <= 100; val++) {
                if(freq[val] > 0) {
                    ans[idx++] = val;
                    freq[val]--;
                    // idx++;
                }
            }
        }
        return ans;
    }
}
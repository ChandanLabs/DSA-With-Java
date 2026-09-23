class Solution {
    public int[] getConcatenation(int[] nums) {
        int j = 0;
        int n = nums.length;
        int result[] = new int[2 * n];

        for(int i = 0; i < result.length; i++) {
            if(i < n) {
                result[i] = nums[i];
            }else if(j < n) {
                result[i] = nums[j];
                j++;
            }
        }
        return result;
    }
}
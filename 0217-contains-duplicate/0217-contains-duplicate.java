class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;

        HashSet<Integer> seen = new HashSet<>();
        for(int i = 0; i < n; i++) {
            if(seen.contains(nums[i])) {
                return true;
            }else{
                seen.add(nums[i]);
            }
        }
        return false;
    }
}
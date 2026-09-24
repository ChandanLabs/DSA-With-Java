class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int getIndex = Math.abs(i - map.get(nums[i]));
                if(getIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
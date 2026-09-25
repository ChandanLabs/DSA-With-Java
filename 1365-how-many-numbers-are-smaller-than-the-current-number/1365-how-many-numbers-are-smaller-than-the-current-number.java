class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        // List<Integer> list = new ArrayList<>();
        int[] list = new int[n];

        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(nums[j] < nums[i]){
                count++;
               }
            }
            list[i] = count;
        }
        return list;
    }
}
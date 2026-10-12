class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int prev = nums[i - 1];
            int curr = nums[i];
            int gap = curr - prev;
            if (gap == 1) {
                continue;
            }
            else if (gap > 1) {
                for (int k = prev + 1; k < curr; k++) {
                    list.add(k);
                }
            }
        }
        return list;
    }
}
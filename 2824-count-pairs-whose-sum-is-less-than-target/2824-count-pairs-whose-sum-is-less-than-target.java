class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            int sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum = nums.get(i) + nums.get(j);

                if (sum < target) {
                    count++;
                }
            }
        }
        return count;
    }
}
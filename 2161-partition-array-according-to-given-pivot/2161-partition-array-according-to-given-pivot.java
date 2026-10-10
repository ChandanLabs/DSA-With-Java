class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] arr = new int[n];
        int j = 0;

        for (int x : nums) {
            if (x < pivot) {
                arr[j] = x;
                j++;
            }
        }
        for (int x : nums) {
            if (x == pivot) {
                arr[j] = x;
                j++;
            }
        }
        for (int x : nums) {
            if (x > pivot) {
                arr[j] = x;
                j++;
            }
        }
        return arr;
    }
}
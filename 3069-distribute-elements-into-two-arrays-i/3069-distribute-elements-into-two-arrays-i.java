class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int i = 0, j = 0;

        arr1[i++] = nums[0];
        arr2[j++] = nums[1];

        for (int k = 2; k < n; k++) {
            if (arr1[i - 1] > arr2[j - 1]) {
                arr1[i++] = nums[k];
            } else {
                arr2[j++] = nums[k];
            }
        }

        int[] result = new int[n];
        int index = 0;

        for (int k = 0; k < i; k++) {
            result[index++] = arr1[k];
        }

        for (int k = 0; k < j; k++) {
            result[index++] = arr2[k];
        }

        return result;
    }
}
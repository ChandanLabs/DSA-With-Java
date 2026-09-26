class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        //choose the pivot 
        int i = n - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if(i >= 0) {
            
        //finding the smallest element but grater than pivot
        int j = n - 1;
        while(nums[j] <= nums[i]) {
            j--;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        }
        //reverse the array
        int left = i + 1;
        int right = n - 1;
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
     
    }
}
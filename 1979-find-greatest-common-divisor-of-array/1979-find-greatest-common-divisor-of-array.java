class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        return GCD(min, max);
    }
    static int GCD(int a, int b){
        // int temp = b;
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
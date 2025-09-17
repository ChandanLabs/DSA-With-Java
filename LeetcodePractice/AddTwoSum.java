import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                if(nums[i] + nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }


    public static void ChecktwoSum(){
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int[] nums1 = new int[n];
       
        
        for(int i = 0;i < n;i++){
            nums1[i] = inp.nextInt();
        }

        int key = inp.nextInt();
        Solution sol = new Solution();
        int[] result = sol.twoSum(nums1,key);
    }
    public static void main(String args[]){
        ChecktwoSum();
    }
}

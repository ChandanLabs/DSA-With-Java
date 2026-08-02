class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        // We use a boolean array to keep track of which numbers are currently in our permutation path
        boolean[] used = new boolean[nums.length];
        
        // Start the recursive backtracking process
        backtrack(result, new ArrayList<>(), nums, used);
        
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> currentPermutation, int[] nums, boolean[] used) {
        // 1. BASE CASE: The permutation is complete when its size equals the array length
        if (currentPermutation.size() == nums.length) {
            // CRITICAL: We must add a COPY of the list, not the reference to the original list
            result.add(new ArrayList<>(currentPermutation));
            return;
        }
        
        // 2. EXPLORE CHOICES: Iterate through all numbers
        for (int i = 0; i < nums.length; i++) {
            // If the number is already used in the current path, skip it
            if (used[i]) continue;
            
            // --- CHOOSE ---
            used[i] = true;
            currentPermutation.add(nums[i]);
            
            // --- EXPLORE (Recursion) ---
            backtrack(result, currentPermutation, nums, used);
            
            // --- UN-CHOOSE (Backtrack) ---
            // Undo the choice so we can explore a different branch of the tree
            used[i] = false;
            currentPermutation.remove(currentPermutation.size() - 1);
        }
    }
}
 
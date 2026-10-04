class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            seen.add(num);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (seen.contains(i)) {
                continue;
            }
            else{
                result.add(i);
            }
        }
        return result;
    }
}
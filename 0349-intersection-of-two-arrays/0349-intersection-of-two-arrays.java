class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums1) {
            set.add(x);
        }
        HashSet<Integer> resultSet = new HashSet<>();
        for(int x : nums2) {
            if(set.contains(x)) {
                resultSet.add(x);
            }
        }
        int[] result = new int[resultSet.size()];
        int i =  0;
        for(int num : resultSet) {
            result[i++] = num;
        }
        return result;
    }
}
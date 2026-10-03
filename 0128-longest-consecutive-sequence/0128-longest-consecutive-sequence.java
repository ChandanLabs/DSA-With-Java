class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int maxlen = 0;

        for(int num : nums) {
            seen.add(num);
        }

        for(int x : seen) {
            int current = x;
            int strike = 0;
            if(!seen.contains(x - 1)) {
                current = x;
                strike = 1;

                while(seen.contains(current + 1)) {
                    strike++;
                    current++;
                }
                maxlen = Math.max(maxlen, strike);
            }
        }
        return maxlen;
    }
}
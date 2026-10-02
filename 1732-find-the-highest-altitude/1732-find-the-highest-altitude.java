class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int Alt = 0;
        int maxAlt = 0;

        for(int i = 0; i < n; i++) {
            Alt += gain[i];
            maxAlt = Math.max(maxAlt, Alt);
        }
        return maxAlt;
    }
}
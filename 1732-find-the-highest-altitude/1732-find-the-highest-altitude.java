class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int maxAlt = 0;
        int alt = 0;
        for(int gains : gain){
            alt+= gains;
            maxAlt = Math.max(maxAlt, alt);
        }
        return maxAlt;
    }
}
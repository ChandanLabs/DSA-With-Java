class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int maxAlt = 0;
        for(int g : gain){
            alt = alt + g;
            if(alt > maxAlt){
                maxAlt = alt;
            }
        }
        return maxAlt;
    }
}
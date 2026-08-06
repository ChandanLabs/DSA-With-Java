class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length; 

        Arrays.sort(g);
        Arrays.sort(s);
        int l = 0;
        int h = 0;
        while(l < n && h < m){
            if(g[l] <= s[h]){
                l++;
                h++;
            }
            else{
                h++;
            }
        }
        return l;
    }
}
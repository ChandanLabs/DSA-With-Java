class Solution {
    public int maxDepth(String s) {
        int currentdepth = 0;
        int maxdepth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
               currentdepth++;
               maxdepth = Math.max(maxdepth, currentdepth);
            }
            else if (c == ')') {
                currentdepth--;
            }
        }
        return maxdepth;
    }
}
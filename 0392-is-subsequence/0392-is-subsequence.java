class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        int left = 0;
        int right = 0;

        while(left < s.length() && right < t.length()) {
            if(str1[left] == str2[right]) {
                left++;
                right++;
            }else{
                right++;
            }

        }
        return s.length() == left;
    }

}
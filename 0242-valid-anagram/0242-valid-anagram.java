class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']++;
            }
        }

        for(char ch : t.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                freq[ch - 'a']--;
            }
        }
        for(int x : freq){
            if(x != 0){
                return false;
            }
        }
        return true;
    }
}
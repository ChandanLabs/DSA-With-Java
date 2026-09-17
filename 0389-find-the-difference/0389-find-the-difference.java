class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        
        // XOR all characters in s
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        
        // XOR all characters in t
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        
        return result;
    }
}
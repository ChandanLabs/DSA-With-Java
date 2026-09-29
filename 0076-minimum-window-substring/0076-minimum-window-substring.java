class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }
        
        // Array to keep track of character frequencies in t
        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        
        int left = 0;
        int right = 0;
        int minStart = 0;
        int minLen = Integer.MAX_VALUE;
        int count = t.length(); // Number of characters we still need to match
        
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            
            // If the character is in t, decrement the required count
            if (map[rightChar] > 0) {
                count--;
            }
            // Always decrement the character's frequency in the map
            map[rightChar]--;
            right++;
            
            // When all characters are matched, try shrinking the window from the left
            while (count == 0) {
                // Update the minimum window if the current one is smaller
                if (right - left < minLen) {
                    minStart = left;
                    minLen = right - left;
                }
                
                char leftChar = s.charAt(left);
                // Restore the character's frequency
                map[leftChar]++;
                // If it's a character from t and its count becomes > 0, we need it again
                if (map[leftChar] > 0) {
                    count++;
                }
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
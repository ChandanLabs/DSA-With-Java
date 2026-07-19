class Solution {
    public String removeDuplicateLetters(String s) {

        // Store the last index of each character
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        // Track whether a character is currently in our result stack
        boolean[] seen = new boolean[26];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int currIdx = ch - 'a';
            
            // If we already included this character in our current path, skip it
            if (seen[currIdx]) {
                continue;
            }
            
            // Pop larger characters from the end if they show up again later
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch && lastIndex[sb.charAt(sb.length() - 1) - 'a'] > i) {
                char removed = sb.charAt(sb.length() - 1);
                seen[removed - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            
            // Add the current character
            sb.append(ch);
            seen[currIdx] = true;
        }
        
        return sb.toString();
    }

}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max_len = 0;

        HashSet<Character> seen = new HashSet<>();
        // char[] ch = s.toCharArray();
        for(int right = 0; right < s.length(); right++){
            char current = s.charAt(right);
            while(seen.contains(current)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(current);
            max_len = Math.max(max_len, right - left + 1);
        }
        return max_len;
    }
}
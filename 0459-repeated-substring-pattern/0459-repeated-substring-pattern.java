class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        
        // The repeating substring can be at most half the length of the string
        for (int i = 1; i <= n / 2; i++) {
            // Check if the current length is a divisor
            if (n % i == 0) {
                String sub = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                
                // Append the substring n/i times
                int repeats = n / i;
                for (int j = 0; j < repeats; j++) {
                    sb.append(sub);
                }
                
                // Check if the constructed string matches the original
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
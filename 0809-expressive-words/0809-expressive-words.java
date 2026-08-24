class Solution {
    public int expressiveWords(String s, String[] words) {
        int ans = 0;

        for (String word : words) {
            int i = 0, j = 0;
            boolean valid = true;

            while (i < s.length() && j < word.length()) {

                if (s.charAt(i) != word.charAt(j)) {
                    valid = false;
                    break;
                }

                char ch = s.charAt(i);

                int countS = 0;
                while (i < s.length() && s.charAt(i) == ch) {
                    countS++;
                    i++;
                }

                int countW = 0;
                while (j < word.length() && word.charAt(j) == ch) {
                    countW++;
                    j++;
                }

                if (countS < countW) {
                    valid = false;
                    break;
                }

                if (countS < 3 && countS != countW) {
                    valid = false;
                    break;
                }
            }

            if (i != s.length() || j != word.length()) {
                valid = false;
            }

            if (valid) {
                ans++;
            }
        }

        return ans;
    }
}
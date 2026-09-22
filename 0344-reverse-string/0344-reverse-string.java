class Solution {
    static void swap(char[] s, int a, int b) {
        char temp = s[a];
            s[a] = s[b];
            s[b] = temp;
    }
    public void reverseString(char[] s) {
        int i = 0,
            j = s.length - 1;
        while(i < j) {
            swap(s, i, j);
            i++;
            j--;
        }
    }
}
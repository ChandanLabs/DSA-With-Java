class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        char[] arr = new char[s.length()];
        
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(isVowel(ch[i])){
                arr[j] = ch[i];
                j++;
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(isVowel(ch[i])){
                ch[i] = arr[j - 1];
                j--;
            }
        }
        return new String(ch);
    }
    boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        else if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return true;
        }
        return false;
    }
}
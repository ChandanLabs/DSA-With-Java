class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();

        Arrays.sort(s_array);
        Arrays.sort(t_array);

        for(int i = 0; i < s_array.length; i++){
            if(s_array[i] != t_array[i]){
                return false;
            }
        }
        return true;
    }
}
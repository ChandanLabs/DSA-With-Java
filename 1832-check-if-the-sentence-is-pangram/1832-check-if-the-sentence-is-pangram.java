class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();

        for(char ch : sentence.toCharArray()){
            // for(int i = 0; i < 26; i++){
                if(!set.contains(ch)){
                   set.add(ch);
                // }
            }    
        }
        if(set.size() == 26){
            return true;
        }
        return false;
    }
}
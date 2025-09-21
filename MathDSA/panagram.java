package MathDSA;

public class panagram {
    public static void main(String[] args) {
        // System.out.println(isPanagram("Chandan"));
        System.out.println(isPanagram(" The quick brown fox jump over the lazy dog"));
    }
    static boolean isPanagram(String s){
        if(s.length() == 0){
            return false;
        }
        boolean[] seen = new boolean[26];
        int cout = 0;
        for(char c : s.toLowerCase().toCharArray()){
            if(c >= 'a' && c <= 'z'){
                int idx = c - 'a';
                if(!seen[idx]){
                    seen[idx] = true;
                    cout++;
                    if(cout == 26){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}

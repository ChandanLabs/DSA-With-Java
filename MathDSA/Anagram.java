package MathDSA;


import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        
    }
    static boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}

package MathDSA;
// import java.util.Arrays;
public class palindrone {
    public static void main(String[] args) {
        
    }
    static boolean isPalindrone(String s){
        if(s.length() == 0){
            return false;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if(s.charAt(left++) != s.charAt(right--)){
                return false;
            }
            // left++;
            // right--;
            
        }


        return true;
    }
}

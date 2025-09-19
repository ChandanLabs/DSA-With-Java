package MathDSA;

public class prime {
    public static void main(String[] args) {
        int n = 30;
        for (int i = 1; i < n; i++) {
            System.out.println(i + " :" + Isprime(n));
        }
       
        
    }
    static boolean Isprime(int n){
        if(n <= 1){
            return false;

        }
        int c = 2;
        while(c * c <= n){
            if(c % n == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}

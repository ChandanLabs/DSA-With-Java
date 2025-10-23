package Recursion;

public class sumofDigits {
    public static void main(String[] args) {
        int ans = SumOfDigits(12345);
        System.out.println(ans);
    }
    static int SumOfDigits(int n){
       
        if(n == 0){
            return 0;
        }
        int rem = (n % 10);
        n = n / 10;
        return rem + SumOfDigits(n);
    }
}

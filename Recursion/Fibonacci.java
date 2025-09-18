package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibo(6);
        System.out.println(ans);
        
    }
    /*
    This method will not work for large numbers once try for 50 
    , this one help to understand the logic hence ,Draw a recursive tree
    and analyse how actually it is working ..
     */
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}

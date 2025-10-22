package Recursion;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int ans = fact(n);
        System.out.println("The factorial of " + n + " :"+ans);
    }
    static int fact(int n){
        if(n <= 1){
            return 1;
        }

        //first it will call fact(n)->fact(n-1)->fact(...)
        return n * fact(n - 1 );
    }
}

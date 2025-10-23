package Recursion;

public class producofDigits {
    public static void main(String[] args) {
        int ans = ProductOfDigits(2234);
        System.out.println(ans);
    }
    static int ProductOfDigits(int n){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        n = n / 10;
        return rem * ProductOfDigits(n);
        //NOTE: small things to be remeber is that when you make the base case as 
        //n == 0 that means at the last it is returing 0 only.. so insted of returning the 
        //we can take the last number of the digit -? and simply return the number
    }
}

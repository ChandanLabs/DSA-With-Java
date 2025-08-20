package functions;

import java.util.*;

public class Factorial {
    // static void PrintFactorial(int n){
    // if(n<0){
    // System.out.println("Invalid number");
    // return;
    // }

    // int factorial = 1;
    // for(int i=n;i>=1;i--){
    // factorial = factorial * i;
    // }
    // System.out.println(factorial);
    // return;
    // }

    // public static void main(String[] args) {

    // Scanner in = new Scanner(System.in);
    // System.out.print("Enter a number:");
    // int num = in.nextInt();
    // PrintFactorial(num);

    // }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int factorial = 1;
        if (num < 1) {
            System.out.println("Invalid number ,The number must be greater than 1");
        } else {
            for (int i = num; i >= 1; i--) {
                factorial = factorial * i;

            }
            System.out.println(factorial);
        }
    }

}

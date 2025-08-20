package functions;
import java.util.*;


public class PrimeCheck {
    static void CheckPrimeNum(int n){
        if(n % 2==1){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = inp.nextInt();
        CheckPrimeNum(num);
    }
}

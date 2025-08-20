package functions;
import java.util.*;

public class OddEven {
    static void CheckOddEvenNum(int n){
        if(n % 2 ==0){
            System.out.println(+n+" is a even number");
        }
        else{
            System.out.println(+n+" is a Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = inp.nextInt();
        CheckOddEvenNum(num);


    }
}

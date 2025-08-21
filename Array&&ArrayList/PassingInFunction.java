import java.util.Scanner;
import java.util.Arrays;

public class PassingInFunction {

    
    static void ChangeArray(int[] num){
        num[1] = 10;
    }
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
       
        for(int i=0;i<n;i++){
            num[i]= sc.nextInt();
        }
        // System.out.println(Arrays.toString(num));
        ChangeArray(num);
        System.out.println(Arrays.toString(num));

    }
}
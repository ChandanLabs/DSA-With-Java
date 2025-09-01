
import java.util.Scanner;
public class Patternone{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("*\t");
                // System.out.print("*");
            }
            System.out.println("");
        }


    }
}